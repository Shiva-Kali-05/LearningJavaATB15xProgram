package ex_14_String;

public class Lab0129_String_Immutable_ex {
    public static void main(String[] args) {
        String name = "Nihal";
        name.concat("Kali");// this will not work, output - only Nihahl
        //name = "Nihal Kali";//if we reassign, then it will work
       // name = name.concat("Kali");
        System.out.println(name);
    }
}
