package LambdaExpressions.j33lambda;

import java.util.function.Predicate;

public class SeedMethods {
    public static <T> void yazdir(T eleman){
        System.out.print(eleman + " ");
    }
    public static boolean ciftMi(int number){
    return number %2 == 0;
    }
    public static int karesiniAl(int number){
        //return (int)Math.pow(number,2);
        return number*number;
    }
    public static int maxBul(int number1,int number2){
       // return Integer.max(number1,number2);
        return number1 > number2 ? number1 : number2;
    }
    public static int minBul(int number1,int number2){
        return number1 > number2 ? number2 : number1;
    }

    public static char getSonKaracter(String str){
        return str.charAt(str.length()-1);
    }

}

