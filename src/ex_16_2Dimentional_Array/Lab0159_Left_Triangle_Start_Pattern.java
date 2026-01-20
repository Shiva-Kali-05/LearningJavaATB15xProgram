package ex_16_2Dimentional_Array;

import java.util.Scanner;

public class Lab0159_Left_Triangle_Start_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for pattern");
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int space =0;space < num-i-1;space++)
            {
                System.out.print(" ");
            }
            for(int star =0;star <=i;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
