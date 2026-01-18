package ex_15_Array;

import java.util.Scanner;

public class Lab0153_Task_ReverseStringWithoutInbuiltFunctions {
    public static void main(String[] args) {
        //Write a Java program to reverse a given string.
        //do it without any inbuilt function
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any String");
        String result = sc.next();
        String reverse="";
        // lets say user input is "Nihal"
        for(int i=result.length()-1; i>=0; i--)
        {
            reverse = reverse + result.charAt(i);
        }
        System.out.println("The reverse string is :" +reverse);
    }
}
