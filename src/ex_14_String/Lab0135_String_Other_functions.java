package ex_14_String;

public class Lab0135_String_Other_functions {
    public static void main(String[] args) {
        String s = "Java";
        char c = s.charAt(2); // charAt method will be start from 0
        System.out.println(c);
        int result = "A".compareTo("a");
        System.out.println(result);
        int result2 = "a".compareTo("A");
        System.out.println(result2);  //97 -65 = 32

        int index = "Java".indexOf("J"); //index starts with 0
        System.out.println(index);

        int lastindex = "Java".lastIndexOf("v");
        System.out.println(lastindex);

        boolean empty = "Java".isEmpty();
        System.out.println(empty);
        String s1 = String.join("*","Paython","Java");
        System.out.println(s1);

        String a = "Java".replace("Java","Advanced Java");
        System.out.println(a);

















    }
}
