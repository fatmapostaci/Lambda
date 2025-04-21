package LambdaExpressions.j33lambda;

import java.util.*;
import java.util.function.*;

public class C03JavadaTanimliFonksArayüsler {

    // (parametreler) -> {body}
    public static void main(String[] args) {
        // Function arayüzü kullanımı:
        Function<String,Integer> stringUzunlugu = edip -> {return edip.trim().length();} ;

        Function<List<Person>,Integer> toplamYas =  presonList -> {
           int sum = 0;
           for (Person kisi: presonList){
               sum+= kisi.getAge();
           };
           return sum;
        };

        Integer toplam = toplamYas.apply(new ArrayList<>(List.of(new Person("Azize",25),new Person("Dilara",32))));
        System.out.println("toplam = " + toplam);

        String str = "   Ey Edip Tuğba Hanımın dediğini yap ";
        String str2 = "Başka cümle";

        Integer uzunluk = stringUzunlugu.apply(str);
        Integer uzunluk2 = stringUzunlugu.apply(str2);
        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk2 = " + uzunluk2);

        // BiFunction Kullanımı:
        BiFunction<Integer, Integer,Integer> exponent = (a,b) -> {
            return (int) Math.pow(Double.valueOf(a),Double.valueOf(b));
        };
        System.out.println(exponent.apply(2, 3));

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 50);
        scores.put("Veli", 70);

        // "Ali"nin puanını 10 artır
        scores.compute("Ali",(key,value) -> (value == null) ? 10 : value +10);
        System.out.println("scores = " + scores);
        scores.computeIfPresent("Veli",(key,value) -> value + 12 );
        scores.replaceAll((key,value)-> value *2);

        // Consumer kullanımı
        Consumer<Person> selamla = (kisi) -> {
            System.out.println(kisi.getName() + " sizi sevgi ile selamlıyor");
        };

        selamla.accept(new Person("Mertay",35));

        List<String> names = Arrays.asList("Ali", "Veli", "Ayşe");
        names.forEach(name -> System.out.println("İsim = "+ name));

        // Supplier kullanımı
        Supplier<List<Person>> initialList = () -> new ArrayList<>(List.of(new Person("Azize",25),new Person("Dilara",12)));

        List<Person> baslangicListesi = initialList.get();
        baslangicListesi.forEach(t -> System.out.println(t));

        // Predicate Kullanımı
        Predicate<Person> isResit = kisi -> {return kisi.getAge()>= 18;};

        System.out.println("isResit.test(baslangicListesi.get(0)) = " + isResit.test(baslangicListesi.get(0)));
        System.out.println("isResit.test(baslangicListesi.get(1)) = " + isResit.test(baslangicListesi.get(1)));

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        numbers.removeIf(num -> num %2 ==0);
        System.out.println("numbers = " + numbers);


    }

}
