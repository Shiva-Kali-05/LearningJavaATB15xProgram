package ex_14_String;

public class Lab0133_String_InterviewQ2 {
    public static void main(String[] args) {
        //How many strings are going to be created in this code?
        String s1 = "Hello";
        String s4 = "hello";  // only one

        String s3 = new String("Hello");
        String s6 = new String("Hello");
        String s5 = new String("Hello");

        // == is a comparision operator basically checks, references in case of string
        System.out.println(s1==s3);// this will not true as because both are stored in different location
        System.out.println(s1==s4); //This will be true, both are in same location
        System.out.println(s3==s6); // here also the ans is false, becoz, stored in diff location
        // Equal method - it will check the value instead of references//
        System.out.println(s3.equals(s1));
        System.out.println(s5.equals(s4));
        System.out.println(s4.equals(s6));// case sensitive so false
        System.out.println(s4.equalsIgnoreCase(s6)); //true, it will ignore the case


    }
}
