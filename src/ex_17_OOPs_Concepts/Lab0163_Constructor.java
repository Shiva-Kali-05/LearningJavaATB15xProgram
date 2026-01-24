package ex_17_OOPs_Concepts;

public class Lab0163_Constructor {
    public static void main(String[] args) {
        Car t = new Car();
        System.out.println(t.name);
        System.out.println(t.model);
        System.out.println(t.year);
        Car p = new Car("Audi");
        System.out.println(p.name);
    }
}
class Car
{
    String name;
    String model;
    int year;

    Car()
    {
        name="Unknown";
        model ="Tesla";
        year =2015;
    }
    Car(String nameGiven)
    {
        this.name=nameGiven;

    }


}
