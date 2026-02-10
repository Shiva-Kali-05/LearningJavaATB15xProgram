package ex_23_OOPs_Abstraction;

public class Lab0177_betterEx_abstract {
    public static void main(String[] args) {
        //this is the runner class
        Alto_car nCar = new Alto_car();
        nCar.drive();
    }

}

abstract  class NanoCar
{
    //these are the incomplete abstract methods in abstract class
    abstract void StartCar();
    abstract void StopCar();
}

class Alto_car extends NanoCar
{

    //if you are extending the Car then you have to first complete abstract method of Car class
    //Alto_Car has it's own method
    void drive()
    {
        //we can call both overriden methods
        StartCar();
        System.out.println("we are driving a car");
        StopCar();
    }

    @Override
    void StartCar() {
        System.out.println("Starting the car");
    }
    @Override
    void StopCar()
    {
        System.out.println("Stoping the car");
    }
}