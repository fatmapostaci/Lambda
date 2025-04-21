package LambdaExpressions.j33lambda;

import java.io.IOException;
import java.util.Arrays;

import static j33lambda.C14TextRead.dosyaAkisi;

public class C15FlatMap {
        /*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.
 */

    public static void main(String[] args) throws IOException {
        String yol = "src/j33lambda/JavaBiterken";

        System.out.println("****Task 05*****");
        //TASK 05 -> hedefDosyasındaki farkli kelimeleri  print ediniz..
        dosyaAkisi(yol)
                .map(t-> t.split(" "))
                        .forEach(t-> System.out.println(Arrays.toString(t)));
                        //.forEach(t-> Arrays.stream(t).forEach(System.out::println));
        dosyaAkisi(yol)
                .map(t-> t.split(" "))
                        .flatMap(Arrays::stream)
                                .distinct()
                                        .forEach(System.out::println);

        System.out.println("\n****Task 06*****");
        //TASK 06 -> hedefDosyasındaki tum kelimeleri natural order  print ediniz..
        dosyaAkisi(yol)
                .map(t-> t.toLowerCase().replaceAll("[:).]","").split(" "))
                        .flatMap(Arrays::stream)
                            .distinct()
                                .sorted()
                                        .forEach(SeedMethods::yazdir);
        System.out.println("\n****Task 07*****");
        //TASK 07 -> hedefDosyasında "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println(dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).]", "").split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("basari"))
                .count());

        System.out.println("\n****Task 08*****");
        //TASK 08 -> hedefDosyasında "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println(dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).]", "").split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                .count());
        System.out.println("\n****Task 09*****");
        //TASK 09 -> hedefDosyasında icinde "a" harfi gecen kelimeleri print ediniz.
        dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).]", "").split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                .forEach(SeedMethods::yazdir);

        System.out.println("\n****Task 10*****");
        //TASK 10 -> hedefDosyasında kac /farklı harf kullanildigini print ediniz.
        System.out.println(dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("\\W", "").split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .count());
        dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("\\W", "").split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(SeedMethods::yazdir);

        System.out.println("\n****Task 11*****");
        //TASK 11 -> hedefDosyasında kac farkli kelime kullanildigini print ediniz.
        System.out.println(dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).]", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count());


        System.out.println("\n****Task 12*****");
        //TASK 12 -> hedefDosyasındaki  farkli kelimeleri print ediniz.
        dosyaAkisi(yol)
                .map(t -> t.toLowerCase().replaceAll("[:).]", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(SeedMethods::yazdir);

    }
}
