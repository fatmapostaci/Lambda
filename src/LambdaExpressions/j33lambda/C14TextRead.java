package LambdaExpressions.j33lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class C14TextRead {
    public static void main(String[] args) throws IOException {
         /*
dosya eklemek icin 2 yol kullanılır
1) Files.lines(Path.of("path")  buradan stream e eklemek icin
Stream <String> satir=Files.lines(Path.of(".........."));
bu bize tekrardan stream tanimlamadan kullanmayi saglar
2) //Files.lines(Paths.get("..........")).  kullanilir
==========================================================
intellj dosya eklemek icin src => new=>file=>text diyoruz ve istedigimiz metni buraya kopyaliyoruz
bu dosyanin path almak icin dosyanin uzerine gelip sag tikliyoruz(burada dosya HalUk)
sonrasinda copy path seciyoruz bundan sonra iki secenek var
1) absolute path seciyoruz yada
2) path from content root seciyoruz
her ikisinde de path kopyalamis oluyoruz

cevirirken EXCEPTION OLUSMASIN DIYE => throws IOException <= EKLEMELIYIZ
buda lines altinda kirmizi uyari veriyor uzerine tiklayinca kendiliginden oluyor.
*/
        String yol = "src/j33lambda/JavaBiterken";

        Stream<String> satirlar = Files.lines(Path.of(yol));
        Stream<String> satirlar2 = Files.lines(Path.of(yol));
        System.out.println("****Task 01*****");
        //TASK 01 --> hedefDosyayı Console'a print eden code create ediniz.
        satirlar
                .forEach(System.out::println);

        System.out.println("\n****Task 02*****");
        //TASK 02 --> hedefDosyayı Console'a buyuk harflerle print eden code create ediniz.
        Files.lines(Path.of(yol))
                .forEach(t-> System.out.println(t.toUpperCase()));
        System.out.println("\n****Task 03*****");
        //TASK 03 --> hedefDosyanın sadece ilk satiri kucuk harflerle print eden code create ediniz.
        dosyaAkisi(yol)
                .limit(1)
                        .map(String::toLowerCase)
                                .forEach(System.out::println);

        System.out.println("\n****Task 04*****");
        //TASK 04 --> hedefDosyayıda "basari" kelimesinin kac satirda gectigini print eden code create ediniz.
        System.out.println(dosyaAkisi(yol)
                .filter(t -> t.contains("basari"))
                .count());

    }
    public static Stream<String> dosyaAkisi(String path){
        Stream<String> lines;
        try {
            lines =  Files.lines(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
