package ex_13_Functions_Or_Methods;

public class Lab0124_InterviewQ {
    //if you have a main function, Can we have another main function?
    //Ans - No, we can have only one main function but if we can change the argument then it is possible.
    // but this is not a main method.
    public static void main(String[] args) {
    }
    public static void main(String args) {
    }
    //Can we have a main function with return type and with parameter?
    //Ans is Yes
    public static int main(int args) {
        return 20;
    }
    //Can we create a main function with boolean also
    //Ans is Yes, we can create
    public static boolean main(boolean args) {
        return true;
    }
}
