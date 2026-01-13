package ex_13_Functions_Or_Methods;

public class Lab0121_Simple_Methods {
    public static void main(String[] args) {
        non_return_function();
        return_boolean_function();
        return_function();
        return_pi_value();

    }
    static void non_return_function()
    {
        System.out.println("This is a non return method/function");
    }
    static int return_function()
    {
        System.out.println("This is a return function");
        return 10;
    }

    static boolean return_boolean_function()
    {
        System.out.println("This is a boolean function with returning");
        return true;
    }
    static float return_pi_value()
    {
        System.out.println("This will return a pi value");
        return 3.14f;
    }
}
