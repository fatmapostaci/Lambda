package LambdaExpressions.j33lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class C08Sorted {

    public static void main(String[] args) {
           /*
sorted() -> akışdaki elemanları naturel order (doğal sıra) halinde akış return eder
sorted() tekrarlı kullanılırsa son return aktif olur...
 */
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));

        System.out.println("****Task01****");
        // Task01-> list çift elemanlarının karelerini k->b sıra ile print eden code create ediniz
        sayiList
                .stream()
                        .filter(SeedMethods::ciftMi)
                                .map(SeedMethods::karesiniAl)
                                        .sorted() // Natural order da sıralar
                                                .forEach(SeedMethods::yazdir);

        System.out.println();
        System.out.println("\n****Task02****");
        // Task02-> list tek elemanlarının karelerini b->k sıra ile print eden code create ediniz
        sayiList
                .stream()
                        .filter(Predicate.not(SeedMethods::ciftMi))
                                .map(SeedMethods::karesiniAl)
                                        .sorted(Comparator.reverseOrder())
                                                .forEach(SeedMethods::yazdir);

        System.out.println();
        System.out.println("\n****Task03****");
    }

}
