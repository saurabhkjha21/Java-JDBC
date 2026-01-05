package ExceptionHandling;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();
        try {
            int result=dividend/divisor;
            System.out.println("Answer: "+result);
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage()); //ae is a class
            System.out.println("Divisors Can't Be Zero");
        }


        /*int result=dividend/divisor;
        Enter Dividend: 10
        Enter Divisor: 0  throw  java.lang.ArithmeticException: / by zero */


    }

}
