package ex_26_Static;

public class Lab0184_Static_A1 {
    public static void main(String[] args) {
       Bank b = new Bank();
        System.out.println(b.empName);
        System.out.println(b.phone);
        System.out.println(b.bankEmp);

    }
}

class Bank
{
    int phone=987852164;
    String empName="Shiva";
    static String bankEmp="Mayur";
    static void attendence()
    {
        System.out.println("Mark the attendence");
        System.out.println(bankEmp);
        //System.out.println(this.phone);//static method can not call/use non static variables
    }
    void display ()
    {
        System.out.println(this.phone + this.empName);
    }
}