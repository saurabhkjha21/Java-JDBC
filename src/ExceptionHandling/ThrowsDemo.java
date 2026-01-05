package ExceptionHandling;

public class ThrowsDemo {
    public static void main(String[] args) {
        divisionDemo(10, 0);
    }
    public static void divisionDemo(int dividend, int divisor) throws  ArithmeticException{
        System.out.println("Result: "+dividend/divisor);
    }

}
