package ex_27_Exceptions;

public class Lab0188_Exception_Unchecked {
    public static void main(String[] args) {
        System.out.println("Starting the program");
        String input_user=args[0];//we are taking an input from the user
        //whatever the user will enter the first argument,we will convert into an integer
        Integer a = Integer.parseInt(input_user);
        Integer output = 100/a;
        System.out.println(output);
        System.out.println("End of the program");
        // here if user enters 0 as an integer value then exception will be occurred
        // ArithmeticException so this exception is coming after running the program so this is Unchecked exception
        // suppose user not entered any input and kept as blank then also will get an exception which is ArrayIndexOutOfBoundsException.
        // suppose user enter any string like, Nihal then also will get an exceptions NumberFormatException
        // this program looks very simple but may be occur three type of exceptions

        // How to handle thse kind of exceptions????



    }
}
