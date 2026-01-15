package ex_14_String;

public class Lab0130_String_Functions {
    public static void main(String[] args) {
        char c ='A';
        System.out.println(c);

        String s1 = "  ABCDS";
        System.out.println(s1);
        System.out.println(s1.length());//Length always starts with one
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.isEmpty());
        System.out.println(s1.substring(2));
        String result = s1.trim();
        System.out.println(result);

    }
}
