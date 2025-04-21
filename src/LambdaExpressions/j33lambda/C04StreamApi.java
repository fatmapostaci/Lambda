package LambdaExpressions.j33lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04StreamApi {

    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));

        System.out.println("***Task01****");
        //task 01->  "Structured Programming"--> Amaele Programming kullanarak list elemanlarını aynı satırda aralarında bosluk olacak şekilde print ediniz.
        listiAradaBoslukIleYazdır(sayiList);
        System.out.println("\n***Task02****");

        //task 02->  "Functional Programming"--> CINCIX Programming kullanarak list elemanlarını aynı satırda aralarında bosluk olacak şekilde print ediniz.
        listiAradaBoslukIleFonksiyonelYazdır(sayiList);
        System.out.println("\n***Task03****");

        listiAradaBoslukIleFonksiyonelYazdır2(sayiList);

        System.out.println("\n***Task04****");
        listiAradaBoslukIleFonksiyonelYazdır3(sayiList);

    }

    private static void listiAradaBoslukIleFonksiyonelYazdır3(List<Integer> sayiList) {
        sayiList.               // Akışa almak istediğim Collection call edilidi
                stream().       // Collection akışa alındı
                forEach(SeedMethods::yazdir); // akıştaki herbir elemanı method referans ile sout içinde yazdırdı

    }

    private static void listiAradaBoslukIleFonksiyonelYazdır2(List<Integer> sayiList) {
        sayiList.               // Akışa almak istediğim Collection call edilidi
                stream().       // Collection akışa alındı
                forEach(System.out::print); // akıştaki herbir elemanı method referans ile sout içinde yazdırdı
    }

    private static void listiAradaBoslukIleFonksiyonelYazdır(List<Integer> sayiList) {
        sayiList.               // Akışa almak istediğim Collection call edilidi
                stream().       // Collection akışa alındı
                forEach(t -> System.out.print(t + " ")); // akıştaki herbir elemanı sout içinde yazdırdı
}

    private static void listiAradaBoslukIleYazdır(List<Integer> sayiList) {
        for (Integer w: sayiList){
            System.out.print(w + " ");
        }
    }
            /*
        stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
        forEach() :datanin parametresine gore her bir elemanı isler
        t-> : Lambda operatoru
         Lambda Expression-->(parameter list) -> {action body}
             Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
             -> Arrow-token: Argüman listesi(parameter list) ile expression gövdesini(action body) birbirine bağlamak için kullanılır.
             Body: Expressionları ve statementları içerir.

            Bir kod bloğundan oluşan bir body...
            Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
            Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.

                () -> {
                 double pi = 3.1415;
                    return pi;
                };
       ahanda trick köşeşinde bugun :   Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

        */

}
