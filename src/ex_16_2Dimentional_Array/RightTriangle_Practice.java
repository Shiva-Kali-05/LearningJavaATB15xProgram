package ex_16_2Dimentional_Array;

public class RightTriangle_Practice {
    public static void main(String[] args) {
        int num=5;
        for(int i = 0;i<5;i++)
        {
            for(int space=0; space<num-i-1;space++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
