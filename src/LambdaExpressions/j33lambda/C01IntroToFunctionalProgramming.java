package LambdaExpressions.j33lambda;

import java.util.ArrayList;
import java.util.List;

public class C01IntroToFunctionalProgramming {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        // Herbir elemanı ekrana yazdır

        // Structural programming Lang --> nasıl yapmalıyım ?
        for (Integer num : nums){
            System.out.print(num + " ");
        }

        System.out.println();

        // Functional programming Lang --> ne yapmalıyılım ?
        nums.forEach((num) -> System.out.print(num + " "));


    /*
    1) Lambda "Functional Programming"-->mathod(action) kullanan pr dili.
       Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
       Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
       Lambda’lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
         Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.

        "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
    2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
    3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
        ve hatasiz code yazma acilarindan cok avantajlıdır(Çoooğ iyi ...  :) ).
    4) Lambda collections'larda(List, Queue ve Set) ve Array'lerde Stream API ile kullanilabilir ancak map'lerde kullanılmaz.
      Lambda kullanmak hatasız code kullanmaktır.

           "Functional Programming"--> CINCIX Programming
           "Structured Programming"--> AMELE Programming

       Collections Nedir?
       Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
       yapar. Array’ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
       yaptığı gibi, daha fazlasını da yapar.
       Java’da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
       topluluğu bir arada tutan bir yapıdır. ‘Collections Framework’ ise arayüzler ve onların kurgularından
       (implementations) oluşur.

        API:Uygulama programlama arayüzü
        (İngilizce: Application Programming Interface, kısaca API), bir yazılımın başka bir yazılımda tanımlanmış işlevlerini
        kullanabilmesi için oluşturulmuş bir tanım bütünüdür.
        API, yazılım bileşeniyle olan etkileşimlerin bir özelliğidir.
        Bu da örnek olarak şu anlama gelir. Bir arabanın bir yazılımı olduğunu hayal edin.
        Bu arabanın API'si arabanın neler yapabileceği hakkında bilgi içerir; hızlanma, frenleme, camları açma, vs.
        Ayrıca bunların nasıl yapabileceğine dair bilgiler de içerir.
        Örneğin hızlanmak için ayağınızı gaz pedalına koyup itersiniz.
        API, ayağınızı gaza bastığınızda motorun içinde neler olduğunu açıklamak zorunda değildir.
        Bu nedenle, içten yanmalı motorlu bir araba kullanmayı öğrendiyseniz, tamamen
        yeni bir dizi beceri öğrenmek zorunda kalmadan API sayesinde elektrikli bir arabayı rahatlıkla kullanabilirsiniz.

*/





    }
}
