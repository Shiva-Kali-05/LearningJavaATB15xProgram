package ex_27_Exceptions;

public class Lab0197_Vulnerable_Code {
    public static void main(String[] args) {
        //Vulnerable code always be in try catch block
        int a =0;
        int b= 0;
        try
        {
            int c= 100/b; //this is vulnerable code
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
