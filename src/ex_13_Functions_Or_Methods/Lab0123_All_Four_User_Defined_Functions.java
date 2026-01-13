package ex_13_Functions_Or_Methods;

public class Lab0123_All_Four_User_Defined_Functions {
//      1. without parameter and without return type
//      2. Without parameter and with return type
//      3. With parameter and without return type
//      4. With parameter and with return type

    public static void main(String[] args) {
        with_parameter_with_returntype(2,5);
        without_parameter_with_returntype();
        with_parameter_without_returntype(5,6);
        without_parameter_without_returntype();

    }
    //      1. without parameter and without return type
    static void without_parameter_without_returntype()
    {
        System.out.println("Hello");
    }

    //      2. Without parameter and with return type
    static int without_parameter_with_returntype()
    {
        return 20;
    }

    //      3. With parameter and without return type

    static void with_parameter_without_returntype(int a, int b)
    {
        System.out.println("India");
    }
   // 4. With parameter and with return type
    static int with_parameter_with_returntype (int c, int d)
    {
        return c*d;
    }

}
