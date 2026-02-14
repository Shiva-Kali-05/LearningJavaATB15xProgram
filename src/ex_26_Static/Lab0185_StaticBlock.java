package ex_26_Static;

public class Lab0185_StaticBlock {
    public static void main(String[] args) {
        //the advantages is, the moment you create an object of class it will automatically call, let's see
        A a = new A();
    }
}

class A
{
    static  //static block
    {
        System.out.println("this is called only when class is loaded");
        System.out.println("we can write a code for reading excel file");
    }
    {
        System.out.println("Instance initialization block");
        //here we can write our code
        //start a website or anything before starting the ...
        //web automation/ api automation
    }
    static int a= 10;
    static void abc()
    {
        System.out.println("This is static function");
    }
}