package LambdaExpressions.j33lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C12Skip {

    public static void main(String[] args) {
        /*
        skip(1) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış döndürür.
    Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür. Bu, durum bilgisi olan bir ara işlemdir.
    skip(list.size()-1) => List’in uzunluğunun 1 eksiğini yazarsak son elemanı yazdırırız.
         */

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));

        // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print eden code create ediniz.
        System.out.println("\n****Version 01*****");
        yemahhh
                .stream()
                        .sorted(Comparator.comparing(t-> t.charAt(t.length()-1)))
                                .skip(2)
                                        .forEach(SeedMethods::yazdir);
        System.out.println("\n****Version 02****");
        System.out.println(yemahhh
                .stream()
                .sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
                .skip(2)
                .toList());

        System.out.println("\n*****Version 03******");
        System.out.println(Arrays.toString(yemahhh
                .stream()
                .sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
                .skip(2)
                .toArray()));


    }
}
