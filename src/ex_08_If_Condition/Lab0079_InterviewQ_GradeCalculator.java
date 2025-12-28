package ex_08_If_Condition;

import java.util.Scanner;

public class Lab0079_InterviewQ_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter marks");
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100)
        {
            System.out.println("Grade A");
        } else if (marks >=0 && marks<=59) {
            System.out.println("Grade F");
        } else if (marks >=60 && marks<=69) {
            System.out.println("Grade D");
            
        } else if (marks >=70 && marks<=79) {
            System.out.println("Grade C");
            
        } else if (marks >=80 && marks<=89) {
            System.out.println("Grade B");
        }

        sc.close();
    }
}
