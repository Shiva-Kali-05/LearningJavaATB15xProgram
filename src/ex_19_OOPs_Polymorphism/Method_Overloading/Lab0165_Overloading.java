package ex_19_OOPs_Polymorphism.Method_Overloading;

public class Lab0165_Overloading {
    public static void main(String[] args) {
        calculation cl = new calculation();

        System.out.println(cl.add(25,25));
        System.out.println(cl.add(10,25,36));
    }

//Overloading happens only in the same class, same methods name but arguments are different
}
class calculation
{
    // function/method
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    double add(double a, double b)
    {
        return a*b;
    }
    String add(String name, String address)
    {
        return name+address;
    }
}

