package ex_17_OOPs_Concepts;

public class Lab0162_Parameterised_Constructor {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("myav");
        Cat c3 = new Cat("chyavvv");
        System.out.println(c2.name);
        System.out.println(c3.name);

    }

}

class Cat
{
    String name;
    Cat()
    {
        System.out.println("Default Constructor");
    }
    Cat(String name)
    {
        this.name="Lucy";
    }
}