package Java_Coding_250_Interview_Questions;

public class Code_02_TablePrint {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++)
        {
            //System.out.println("2 * " + i + "=" + (2 * i));
            //System.out.println("5 * " +i+ "=" +(5* i));
            //Using Printf statement
            System.out.printf("2 * %d=%d%n", i, (2 * i));
        }

    }
}
