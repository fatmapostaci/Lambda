package LambdaExpressions.j33lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C05Filter {
        /*
    Filter:
    Dizimiz veya Collection’ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır

     */

    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));

        //Task01->"Structured Programming"--> AMELE Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n      ************** Task01**************");
        ciftSayilariYazdir(sayiList);

        //task02-> "Functional Programming"--> CINCIX Programming kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n      ************** Task02**************");
        ciftSayilariFonkYazdir(sayiList);

        //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n      ************** Task03**************");
        ndenKucukCiftSayilariYazdir(sayiList,35);

        //task04-> "Functional Programming"--> CINCIX Programming kullanarak  listin 34'den buyuk yada  tek elemanlarını aynı satırda aralarında bosluk ile print ediniz
        System.out.println("\n      ************** Task04**************");
        ndenBuyukVeyaTekSayilariYazdır(sayiList,34);
    }

    private static void ndenBuyukVeyaTekSayilariYazdır(List<Integer> sayiList, int num) {
        sayiList.
                stream().
                filter(t-> t>num || t%2!=0).
                forEach(SeedMethods::yazdir);
    }

    private static void ndenKucukCiftSayilariYazdir(List<Integer> sayiList, int num) {
        sayiList.
                stream().
                filter(SeedMethods::ciftMi).
                filter(t -> t< num).
                forEach(SeedMethods::yazdir);
                // filter(t -> t<num && t%2==0)
    }

    private static void ciftSayilariFonkYazdir(List<Integer> sayiList) {
        sayiList.
                stream().                       // Collection akışa alındı
                filter(SeedMethods::ciftMi).    // Akışdaki elemanları çift olma durumlarıına göre filtreledik
                forEach(SeedMethods::yazdir);   // Süzülen elemanları teker teker yazdırdık

                //filter(t-> t%2 == 0).

    }

    private static void ciftSayilariYazdir(List<Integer> sayiList) {
        for (Integer num:sayiList){
            if (num %2 ==0){
                System.out.print(num + " ");
            }
        }
    }
}
