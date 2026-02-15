package ex_27_Exceptions;

public class Lab0193_Try_InterviewQ {
    public static void main(String[] args) {
        //What is the output of the program?
        String name = null;
        name.trim();//NullPointerException, here the code will not run further
        int a = 10/0; // This code will not run - (Arithmetic exception)
        System.out.println("End");//this is also not run

        //We can handle this by using try catch in next program


    }
}
