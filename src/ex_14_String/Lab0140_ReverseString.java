package ex_14_String;

import java.util.Scanner;

public class Lab0140_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String result = sc.next();
        String rev ="";
        for(int i=result.length()-1; i>=0; i--)
        {
            rev= rev + result.charAt(i);
        }
        System.out.println(rev);
    }
}
