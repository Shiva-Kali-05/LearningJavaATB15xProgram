package ex_23_OOPs_Abstraction;

public class Lab0175_abstraction {
    public static void main(String[] args) {
        car c = new car();
        c.drive();
    }
}


class vehicle
{
    public  int max_speed =180;

    vehicle()
    {
        System.out.println("Default constructor");
    }

    vehicle(int a )
    {
        System.out.println("Parameterised constructor");
    }
    vehicle(int a, int b )
    {
        System.out.println("Parameterised constructor");
    }
    void normalmethod()
    {
        System.out.println("Just a normal method");
    }
    void normalmethod(int a)
    {
        System.out.println("method overloading");
    }
    void drive()
    {
        System.out.println("vehicle parent");
    }
    void notest()
    {
        System.out.println("Empty");
    }
}

class car extends vehicle
{
    private int max_speed =280;

    car()
    {
        super(100);
    }
    car(int a)
    {
        System.out.println("Parent class car");
    }
    void test()
    {
        System.out.println("method of current class");
    }
    void drive()
    {
        super.drive();
        this.test();
        super.notest();
    }
}