package ex_13_Functions_Or_Methods;

import java.util.Scanner;

public class Lab0122_UserDefined_Functions_one {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number for A");
        int a = sc.nextInt();
        System.out.println("Enter a number for B");
        int b = sc.nextInt();
        int sum = sum_of_two_numbers(a,b);
        System.out.println("Sum of the number is :" +sum);
    }
    static int sum_of_two_numbers(int a, int b)
    {
        return a+b;
    }

}
