package ex_16_2Dimentional_Array;

import java.util.Scanner;

public class Lab0158_Right_Triangle_Start_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for pattern");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
