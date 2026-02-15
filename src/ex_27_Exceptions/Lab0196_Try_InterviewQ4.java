package ex_27_Exceptions;

public class Lab0196_Try_InterviewQ4 {
    public static void main(String[] args) {

        try
        {
            String userInput = args[0];
            Integer a = Integer.parseInt(userInput);
            Integer output = 100/a;
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("End of the program");
    }
}
