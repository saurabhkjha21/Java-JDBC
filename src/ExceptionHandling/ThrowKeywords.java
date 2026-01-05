package ExceptionHandling;

import java.util.Scanner;

public class ThrowKeywords {
    public static void main(String[] args) {
        /*Used to explicitly throw a single exception.
        We use throw when something goes wrong (or “shouldn’t happen”) and
        we want to stop normal flow and hand control to exception handling.*/
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        checkAge(age);

    }
    public static void checkAge(int age){
        if(age<18){
            System.out.println("Not eligible to vote!");
            throw new RuntimeException("You can't vote...");
        }else{
            System.out.println("Eligible to vote!");
        }
    }
}
