package LambdaExpressions.j33lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class C07Reduce {
            /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılımlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */

    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 35, 34, 25, 16, 6));

        System.out.println("****Task01****");
        //Task01-> list çift elemanlarının karelerinin en buyugunu print code create ediniz...
        ciftSayilarinEnbuyugunuYazdir(sayiList);

        System.out.println("\n****Task02****");
        //Task02-> list elemanlarının toplamını  print code create ediniz...
        listElemanlarininToplami(sayiList);

        System.out.println("\n****Task03****");
        //Task03-> list'in çift elemanlarının çarpımını  print code create ediniz...
        ciftElemanlarinCarpimi(sayiList);

        System.out.println("\n****Task04****");
        //Task04-> list elemanlarının en küçüğünü  print code 4 farklı code create ediniz...
        listElemanlarininEnKucugu(sayiList);

        System.out.println("\n****Task05****");
        // Task05-> List elemanlarının 25'den buyuk en kucuk tek elemanını print eden code create ediniz...
        System.out.println(sayiList
                .stream()
                //.filter(Predicate.not(SeedMethods::ciftMi))
                .filter(t -> t > 25 && t % 2 == 1)
                .reduce(Integer.MAX_VALUE, SeedMethods::minBul));
    }

    private static void listElemanlarininEnKucugu(List<Integer> sayiList) {
        System.out.println(sayiList
                .stream()
                .reduce((u, v) -> u > v ? v : u)
                .orElse(-1)); // boş stream de çalışırsa min bulamayıp -1 döndürecek.

        System.out.println(sayiList
                .stream()
                .reduce(Math::min)
                .get());

        System.out.println(sayiList
                .stream()
                .reduce(sayiList.get(0), Math::min));

        System.out.println(sayiList
                .stream()
                .reduce(Integer.MAX_VALUE, SeedMethods::minBul));


    }

    private static void ciftElemanlarinCarpimi(List<Integer> sayiList) {
        System.out.println(sayiList
                .stream()
                .filter(SeedMethods::ciftMi)
                .reduce(1, Math::multiplyExact));

    }

    private static void listElemanlarininToplami(List<Integer> sayiList) {
        Integer sum =sayiList
                .stream()
                .reduce(0,Math::addExact);
        System.out.println("List elemanlarının toplamı = " + sum);

        Optional<Integer> sum2 =sayiList
                .stream()
                .reduce(Math::addExact);

        System.out.println("List elemanlarının toplamı = " + sum2.orElse(0));

    }

    private static void ciftSayilarinEnbuyugunuYazdir(List<Integer> sayiList) {
      /*
      Integer maximum =
        sayiList                    // (7, 58, 17, 35, 34, 25, 16, 6)
                .stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::karesiniAl)
                //.reduce((t,u) -> t > u ? t:u)
                //.reduce(SeedMethods::maxBul)
                .reduce(Math::max)
                .get();
        System.out.println("Çift sayıların karesinin en büyüğü = " + maximum);

       */

       /*
       Optional <Integer> opt =
                sayiList                    // (7, 58, 17, 35, 34, 25, 16, 6)
                        .stream()
                        .filter(SeedMethods::ciftMi)
                        .map(SeedMethods::karesiniAl)
                        //.reduce((t,u) -> t > u ? t:u)
                        //.reduce(SeedMethods::maxBul)
                        .reduce(Math::max);
        System.out.println("opt = " + opt);

        if (opt.isPresent()){
            System.out.println("opt.get() = " + opt.get());
        } else {
            System.out.println("Listeniz boş kardeş");
        }
        */

        Integer maximum =
        sayiList
                .stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::karesiniAl)
                .reduce(sayiList.get(0),SeedMethods::maxBul);
        System.out.println("Çift sayıların karesinin en büyüğü = " + maximum);

    }
}








