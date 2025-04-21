package LambdaExpressions.j33lambda;
@FunctionalInterface
public interface MathOperations {
    double calculate(int a,int b);

    default void selamla(){
        System.out.println("Selamlar arkadaşlar sevdiniz mi Lambdayı");
    }
}
