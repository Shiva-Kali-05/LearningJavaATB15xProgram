package ex_27_Exceptions;

import java.util.Scanner;

public class Lab0199_Try_catch_Finally_uses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        try
        {
            num = 100/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();//finally will be always use
            System.out.println("end of the program and scanner is closed");
        }

        // sc.close();// this code is not run because of the exception
    }
}
