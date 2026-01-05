package ExceptionHandling;

import java.util.Scanner;

public class tryCatchMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        try{
            arr[6]=10;

        }
        catch(ArithmeticException  | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
//        catch(ArrayIndexOutOfBoundsException ao){
//            System.out.println(ao.getMessage());
//        }
    }
}
