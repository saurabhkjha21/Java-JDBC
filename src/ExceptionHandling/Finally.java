package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        /*The finally block always executed whether an exception is thrown or not.
        The finally is used for closing resources like db connections, open files and network connections,
         It is used after a try-catch block to execute code that must run.*/

        int[] arr= {1,2,3,4,5};
        try {
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException ao){
            System.out.println(ao);
            System.out.println(ao.getMessage());
        }finally {
            System.out.println("This block always execute");
        }
        System.out.println("Program Continues.....");
    }

}
