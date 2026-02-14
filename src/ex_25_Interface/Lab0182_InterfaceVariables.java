package ex_25_Interface;

public class Lab0182_InterfaceVariables {

}

interface shiva
{
    //incomplete methods
    final int a =10;
    void display();
}

class shubham implements shiva
{
    int aa =10;
    @Override
    public void display()
    {
        //System.out.println(super.a);//we can't access parent interface variable by super keyword
        // you can access directly
        System.out.println(a);// possible
        System.out.println(this.aa);//this is accessible because it is related to current class
    }
}