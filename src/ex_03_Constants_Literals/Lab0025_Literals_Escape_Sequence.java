package ex_03_Constants_Literals;

public class Lab0025_Literals_Escape_Sequence {
    public static void main(String[] args) {
        char new_line ='\n';
        char tab_line ='\t';
        char back_space = '\b';
        System.out.println("NihalKali");
        //System.out.println("Nihal" +new_line+"Kali");
        System.out.println("Nihal\nKali"); // new line
        System.out.println("Nihal\tKali"); // tab
        System.out.println("Nihal\bKali");  //backspace

    }
}
