package ex_27_Exceptions;

public class Lab0190_Exception_Handling {
    public static void main(String[] args) {
        int a = 0;
        try
        {
            a=10/0;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(a);

        //which line has the problem? 6
        // is JVM knows about the exception ? No, so this is unchecked exception
        //How to handle this? by using Try Catch block
//Note - Exception is a class which is extended from Thowable
    }
}
