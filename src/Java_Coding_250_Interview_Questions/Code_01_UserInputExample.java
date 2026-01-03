package Java_Coding_250_Interview_Questions;

import java.util.Scanner;

public class Code_01_UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int a = sc.nextInt();
        System.out.println("You have entered : " +a);
        sc.close();

    }
}
