package ex_10_For_Loop;

import java.util.Scanner;

public class Lab0108_Factorial_Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int fact = 1;
        if (sc.hasNextInt())
           {
            int num = sc.nextInt();
           // System.out.println(num);
            for (int i = 1; i <= num; i++)
             {
                fact = fact * i;
             }
            System.out.println("Factorial number is :" + fact);
        } else {
            System.out.println("Please enter only intgere value");
        }
    }
}
