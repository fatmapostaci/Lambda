package LambdaExpressions.j33lambda;

import java.util.stream.IntStream;

public class C16StreamIterator {

    public static void main(String[] args) {
        System.out.println("****Task 01*****");
        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir code create ediniz.
        System.out.println(amaleToplama(10));
        System.out.println(karizmatikToplama(10));
        System.out.println("\n****Task 02*****");
        //TASK 02 --> 1'den x'e kadar (x dahil) cift tamsayilari toplayan bir code create ediniz
        System.out.println(ciftTamSayilariTopla(10));

        System.out.println("****Task 03*****");
        //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.
        System.out.println(ilkxCiftSayiToplami1(10));
        System.out.println(ilkxCiftSayiToplamiItr(10));
        System.out.println("\n****Task 04*****");
        //TASK 04 --> Ilk X adet pozitif tek tamsayiyi toplayan programi  create ediniz.
        System.out.println(ilkxTekSayiToplami(10));

        System.out.println("\n****Task 05*****");
        //TASK 05 --> 2 nin ilk x adet kuvvetini yazdırın.
        ikininIlkXKuvveti(5);

        System.out.println("\n****Task 06*****");
        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.
        sayininIlkXKuvvetiniYazdir(3,5);

        System.out.println("\n****Task 07*****");
        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.
        System.out.println(faktoriyel(3));

        System.out.println("\n****Task 08*****");
        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini print eden code  create ediniz.
       sayininXKuvvetiniYazdir(4,3);
    }

    private static void sayininXKuvvetiniYazdir(int istenSayi, int x) {
        IntStream
                .iterate(istenSayi, t -> t * istenSayi)
                .limit(x)
                .skip(x - 1)
                .forEach(SeedMethods::yazdir);
    }
    private static int faktoriyel(int sayi) {
        return IntStream
                .rangeClosed(1,sayi)
                .reduce(1,(t,u)->t*u);
    }

    private static void sayininIlkXKuvvetiniYazdir(int sayi, int ust) {
        IntStream
                .iterate(sayi,t-> t*sayi)
                .limit(ust)
                .forEach(SeedMethods::yazdir);
    }

    private static void ikininIlkXKuvveti(int x) {
        IntStream
                .iterate(2,t-> t*2 )
                .limit(x)
                .forEach(SeedMethods::yazdir);
    }

    private static int ilkxTekSayiToplami(int x) {
        return IntStream
                .iterate(1,t-> t+2)
                .limit(10)
                .sum();

    }

    private static int ilkxCiftSayiToplami1(int x) {
        return IntStream
                .rangeClosed(1,3*x)
                .filter(SeedMethods::ciftMi)
                .limit(x)
                .sum();
    }

    private static int ilkxCiftSayiToplamiItr(int x) {
        return IntStream
                .iterate(2,t->t+2) // sonsuza kadar her döngüde seed değerini 2 arttıran döngü oluşturuldu
                .limit(x)
                .sum();
    }
    private static int ciftTamSayilariTopla(int x) {
        return IntStream
                .range(1,x)
                .filter(SeedMethods::ciftMi)
                .sum();
    }

    private static int karizmatikToplama(int x) {
        return IntStream
                .range(1,x) // 1 dahil ama 10 dahil değil
                //.rangeClosed(1,10) // 1 ve 10 dahil
                .sum();
    }

    private static int amaleToplama(int x) {
       int sum=0;
        for (int i=1; i<x; i++){
           sum+=i;
        }
        return sum;
    }
}
