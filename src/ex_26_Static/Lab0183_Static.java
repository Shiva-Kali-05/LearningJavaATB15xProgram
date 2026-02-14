package ex_26_Static;

public class Lab0183_Static {
    //Static is a keyword, static members are shared among all instances
    //They can access without creating an object of the class
    // Static can be a Function, can be a variable, can be a method and can be a class (but not useful)
    public static void main(String[] args) {

        Student s1 = new Student(23);
        Student s2 = new Student(15);
        //both of them have different ages
        System.out.println(s1.age);
        System.out.println(s2.age);

        //static variable - shared among both instances
        System.out.println(s1.Notes);
        System.out.println(s2.Notes);


    }
}
//example

class Student
{
    int age;//non static or instance variable
    static String Notes="Java notes";//static method

    //will create a parameterised constructor
    Student(int age_a)
    {
        this.age=age_a;
    }

    //will create a Static block
    static void Monkey()
    {
        System.out.println("I am a static method");
    }
}
