package LambdaExpressions.j33lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C11Limit {
    public static void main(String[] args) {
        /*
        Limit(n)
    Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize yarayan,
    sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında
    Stream içerisinde dönen çok sayıda veri var
    ancak sen bize şu kadarını göster diyoruz.
         */
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println("***Task01****");
        // Task-> list elemanlarının karakter sayısı en buyuk olanı print code create ediniz...
        System.out.println("****Version 01****");
        yemahhh
                .stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .forEach(SeedMethods::yazdir);

        System.out.println("\n****Version 02");

        System.out.println(yemahhh
                .stream()
                .map(String::length)
                .reduce(Integer.MIN_VALUE, Math::max));

        System.out.println("\n****Version 03****");
        System.out.println(yemahhh
                .stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get());
        System.out.println("\n****Version 04****");

        Object[] intArr =  (yemahhh
                .stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .toArray());
        System.out.println(Arrays.toString(intArr));

        System.out.println("\n****Version 05****");
        List<Integer> karakterList = yemahhh
                .stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .toList(); // Modifiye edilemeyen (add remove yok), immutable
                //karakterList.add(3); // --> UnsupportedOperationException
        System.out.println(karakterList);

        List<Integer> karakterList2 = yemahhh
                .stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .collect(Collectors.toList());  // Modifiye edilebilen mutable
        karakterList2.add(3);
        System.out.println(karakterList2);


    }
}
