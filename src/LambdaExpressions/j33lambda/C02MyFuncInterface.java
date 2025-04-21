package LambdaExpressions.j33lambda;

public class C02MyFuncInterface {

    public static void main(String[] args) {
        // Kendi fonksiyonel arayüzlerimizi tanımlayıp lambda ifadeleriyle kullanabiliriz.
        // Bunun için @FunctionalInterface tag ı ile içinde sadece bir abstract metod olan interface oluşturmalıyız

        MathOperations sum = (a,b) -> {return a+b;}; // MathOperations daki calculate metodunu override ettim.
        double toplam = sum.calculate(4,8);
        System.out.println("toplam = " + toplam);

        MathOperations subtract = (buyukSayi,kucukSayi) -> {return buyukSayi - kucukSayi;};
        System.out.println("subtract.calculate(15,3) = " + subtract.calculate(15, 3));

        sum.selamla();
        subtract.selamla();

    }
}
