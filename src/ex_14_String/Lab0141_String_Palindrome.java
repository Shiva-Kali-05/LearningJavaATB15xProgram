package ex_14_String;

import java.util.Scanner;

public class Lab0141_String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String user_input = sc.next();
        String reversed = "";
        for(int i = user_input.length()-1;i>=0;i--)
        {
            reversed = reversed+user_input.charAt(i);
        }
        if(reversed.equalsIgnoreCase(user_input))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
