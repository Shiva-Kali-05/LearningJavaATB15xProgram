package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab0116_GuessingNumbers {
    //Guess the number from 1 to 100
    // Solution
    // lets say number is 56
    public static void main(String[] args) {
     Random random = new Random();
     int NumToGuess= random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int guess;
        int NoOfAttempts = 0;
        while(true)
        {
            if(!sc.hasNextInt())
            {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }
            guess = sc.nextInt();
            NoOfAttempts++;
            if(guess < NumToGuess)
            {
                System.out.println("Number is too Low");
            }
            else if(guess > NumToGuess){
                System.out.println("Number is too High");
            }
            else
            {
                System.out.println("Your guess is correct & you have taken " +NoOfAttempts);
            }
        }







    }
}
