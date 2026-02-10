package ex_24_Coding_Challenges1;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void info()
    {
        System.out.println("Name: " +name);
        System.out.println("Age :" +age);
    }
}

    class Details {
        public static void main(String[] args) {
            Person p = new Person("John",30);
            Person p2 = new Person("Alice",30);
            p.info();
            p2.info();

        }
    }





