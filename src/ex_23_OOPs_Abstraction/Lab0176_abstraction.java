package ex_23_OOPs_Abstraction;

public class Lab0176_abstraction {
    public static void main(String[] args) {
        Son sc = new Son();
        sc.loan50k();
        sc.loan10k();
        // here by looking into the above code, we don't see a father has loan
        // father loan is hidden and son is actually paying.
    }
}

abstract class Father
{
    abstract void loan50k(); //incomplete method (abstract method)
     void loan10k()//complete method which is also called as Concrete method
    {
        System.out.println("Given");
    }
}
class Son extends Father
{
    //need to complete the abstract method first which is incomplete in the Father class.
    // so here how the abstraction is works? - will create a class with main method and then create an object

    @Override
    void loan50k() {

    }
}