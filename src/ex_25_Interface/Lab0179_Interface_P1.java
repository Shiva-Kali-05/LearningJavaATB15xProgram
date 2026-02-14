package ex_25_Interface;

public class Lab0179_Interface_P1 {
    public static void main(String[] args) {
        Car2 c2 = new Car2();
        c2.drive();
        // so here by using interfaces we are able to hide methods
        // by looking into the above code, we don't think engine is exist, brakes exist? we have hided using interface
    }

}


class Car2 implements Brakes, engine
{
    void drive()
    {
        startEngine();
        stopEngine();
        testEngine();
        applyBrakes();
    }

    @Override
    public void applyBrakes() {
        System.out.println("Apply brakes");
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stope engine");
    }
}


interface Brakes
{
    // Interface have an incomplete methods always. but using static and default we can have complete methods.
    void applyBrakes();

}
interface  engine{
    void startEngine();
    void stopEngine();// both are incomplete in nature
    //using static and default we can have complete methods

    default void testEngine()
    {
        System.out.println("Concrete method/complete method");
    }
    static void testEngineStatic()
    {
        System.out.println("complete method");
    }

}

