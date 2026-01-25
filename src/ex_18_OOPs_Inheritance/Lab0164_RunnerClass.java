package ex_18_OOPs_Inheritance;

public class Lab0164_RunnerClass {
    public static void main(String[] args) {
        Son nihal = new Son();
        System.out.println(nihal.gold);//used from the father
        nihal.home_2BHK();//used from the father
        nihal.home_3BHK();//used his own property

        Father f= new Father();
        f.home_2BHK();
        System.out.println(f.gold);
//        f.home_3BHK(); // father can not use son's property


    }
}
