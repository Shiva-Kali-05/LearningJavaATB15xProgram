package ex_14_String;

public class Lab0136_String_Interview {
    public static void main(String[] args) {
        //What is the ans?
        String s = "Java".substring(2);
        System.out.println(s); // remove the first two char & returns the output
        String str = " Nihal Kali".substring(1);
        System.out.println(str);
        boolean b = "Nihal Kali".isBlank();
        System.out.println(b);
        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
