package ex_02_Java_Basics_ClassNames;

public class Lab0019_Constants {
    public static void main(String[] args) {
        int max_user = 120;  //normal local variable
        max_user=125;
        System.out.println(max_user); //so the latest value will get print.
        final int MAX_USER2= 500;
        //MAX_USER2 = 501;  //will give an error
        System.out.println(MAX_USER2);
        float pi=3.14f;
        pi=3.15f; // we can change the value because not mentioned as final
        System.out.println(pi);



    }
}
