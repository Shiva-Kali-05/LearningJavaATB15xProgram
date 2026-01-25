package ex_17_OOPs_Concepts;

public class Constructor_Chaning {
    String name;
    int age;
    String gender;
    public static void main(String[] args) {
       Constructor_Chaning cc= new Constructor_Chaning("Nihal",5,"Male");
       cc.name="Nihal";
       cc.gender="Male";
       cc.age=5;
        System.out.println(cc.name);
        System.out.println(cc.gender);
        System.out.println(cc.age);
    }
    public Constructor_Chaning(String name,String gender)
    {
        this.name="Nihal";
        this.gender="male";

    }
    public Constructor_Chaning(String name, int age, String gender)
    {
        this(name,gender); //Constructor chaning..we using these two from the above method.
        this.age=5;

    }
}
