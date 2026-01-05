package ExceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int x=10/0;
        }
        catch (ArithmeticException e){//child class
            System.out.println(e.getMessage());
        }
        catch (Exception e){//parent class
            System.out.println(e.getMessage());
        }

    }
}
