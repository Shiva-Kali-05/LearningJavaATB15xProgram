package ex_27_Exceptions;

public class Lab0192_Try_Multiple_Catch {
    public static void main(String[] args) {
        //Multiple catch are allowed with one try block
        System.out.println("5");
        try
        {
            int a = 100/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception occurred");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("100");

        // here Exception from catch is a bigger basket and Arithmetic is smaller basket
        // first of all, we always try with smaller one rather than going with the bigger one



    }
}
