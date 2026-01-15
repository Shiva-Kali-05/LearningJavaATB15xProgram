package ex_14_String;

public class Lab0137_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        //90% time we use
        String str = "Nihal";
        System.out.println(str);

        //Only 10 % time we use below

        StringBuilder sb = new StringBuilder("NihalKali");
        System.out.println(sb);
        StringBuffer buffer = new StringBuffer("Shiva");
        System.out.println(buffer);
        System.out.println(sb.reverse());
        System.out.println(buffer.reverse());
    }
}
