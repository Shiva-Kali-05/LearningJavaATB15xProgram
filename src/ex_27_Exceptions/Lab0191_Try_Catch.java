package ex_27_Exceptions;

public class Lab0191_Try_Catch {
    public static void main(String[] args) {
        System.out.println("1");
        try
        {
            int a =10/0;
        }
        catch (ArithmeticException e) // here we are using exact exception which is Arithmetic
        {
            System.out.println("You are making fool");
        }
        System.out.println("2");
    }
}
