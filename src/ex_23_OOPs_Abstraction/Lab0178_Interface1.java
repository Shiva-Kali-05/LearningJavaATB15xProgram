package ex_23_OOPs_Abstraction;

public class Lab0178_Interface1 {

    public static void main(String[] args) {
        Car5 cr5 = new Car5();
        cr5.drive(); // by looking into this code,is engine exists ? no this what we are hidding.
    }
}

class Car5 implements Brakes,engine1
{

    void drive()
    {
        startEngine();
        stopEngine();
        applyBreak();
        testEngine();

    }


    @Override
    public void applyBreak() {
        System.out.println("Apply Breaks");
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop the engine");
    }
}





//Interface can be declared with interface keywork instead of class

interface Brakes
{
    void applyBreak(); //Incomplete method & interfaces are always incomplete in nature

//    default void applyBreak2() //complete methods are possible only when if we make a default
//    { }
}

interface engine1
{
    //it has two incomplete methods
    void startEngine();
    void stopEngine();

    // we can also have default with complete method and static method
    default void testEngine()
    {
        System.out.println("Concrete method or complete method");
    }

    //Static method
    static void testEngineStatic()
    {
        System.out.println("Concrete method or complete method");
    }


}