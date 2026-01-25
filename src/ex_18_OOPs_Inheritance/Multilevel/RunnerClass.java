package ex_18_OOPs_Inheritance.Multilevel;

public class RunnerClass {
    public static void main(String[] args) {
        Son2 Nihal = new Son2(); // son can access from his father as well as gran father.
        Nihal.home();
        Nihal.money();
        Nihal.grandHome();
        Nihal.clubHouse();
        //here we used multi level inheritance

        Father fat = new Father(); //Father has some limitations, he can access only grand father function.
        fat.grandHome();
        fat.home();
        fat.money();

        GrandFather gf = new GrandFather(); //grand father can access only his property
        gf.home();
        gf.money();
        //Dynamic Dispatch
        GrandFather gf1 = new Son2(); // possible
        gf1.money();//even we create an object of son we can use only grand father functions.

        Father f = new Son2();
        //this is also allowed
        //Real problems starts here
        //Son2 s2 = new GrandFather()  -- not possible
        //Son2 s3 = new Father() --- not possible





    }
}
