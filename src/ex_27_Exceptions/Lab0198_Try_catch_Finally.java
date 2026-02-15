package ex_27_Exceptions;

public class Lab0198_Try_catch_Finally {
    public static void main(String[] args) {
        Integer a = Integer.parseInt(args[0]);
        Integer c=0;
        try
        {
            int b= 100/a;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be always executes");
        }
    }
}
