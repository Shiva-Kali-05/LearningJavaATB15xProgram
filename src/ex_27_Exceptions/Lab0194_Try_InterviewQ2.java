package ex_27_Exceptions;

public class Lab0194_Try_InterviewQ2 {
    public static void main(String[] args) {
        String s1 = null;
        try
        {
            s1.trim();
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            int a = 100/0;
        }
        catch (ArithmeticException f)
        {
            System.out.println(f.getMessage());
        }

        System.out.println("End");

        // Please note that, the above code this is not a good way to write
        // This looks a junior test engineer code, we can combine these two exceptions
        // see the next example
    }

}
