package ex_27_Exceptions;

public class Lab0189_Exception_StringNullPointer {
    public static void main(String[] args) {
        // we have a null string and trying to trim
        String name =null;
        name.trim();
        //we can see no error in this case, but it will throw nullPointerException as because null cannot be trimmed
        //this is a unchecked exception

    }
}
