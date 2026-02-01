package ex_19_OOPs_Polymorphism.Method_Overidding;

public class Lab0167_Overriding {
    //Overriding can only be done in case of inheritance.
    //if you don't have inheritance Overriding will not work
    public static void main(String[] args) {
        Shiva sh = new Shiva();
        sh.home();

        Father fh = new Father();
        fh.home();

        Father fh1= new Shiva(); //This is Dynamic Dispatch
        fh1.home();

       // Shiva s= new Father(); this is not possible as because when father is getting born, child reference cannot be given to.

    }
}


class Father
{
    void home()
    {
        System.out.println("My father have 2BHK home");
    }
}

class Shiva extends Father
{
    @Override
    void home() //method name and even return type is same in the subclass
    {
        System.out.println("I have 1BHK home");
    }
}
