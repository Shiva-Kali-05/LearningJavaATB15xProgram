package ex_14_String;

public class Lab0132_String_InterviewQ1 {
    public static void main(String[] args) {
        //How many strings are present in String Constant pool
        String s1 = "Hello"; // 1
        String s2 = "Hello";  // Still one..reuse
        String s10 = "Hello"; //Still only one..reuse
        String s12 = "hello"; //2

        String s3 = new String("Hello"); //1
        String s4 = new String("Hello"); //2
        String s5 = new String("Hello"); //3
        String s6 = new String("Hello"); //4

        // so the ans is 2+4 = 6


    }
}
