package ex_27_Exceptions;

public class Lab0195_Try_InterviewQ3 {
    public static void main(String[] args) {
        // we can handle two exception in one line code

        String name= null;
        try
        {
            name.trim();
            int a = 100/0;
        }
        catch (NullPointerException | ArithmeticException e )
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Nihal");
        }
        System.out.println("End of the program");
    }
}
