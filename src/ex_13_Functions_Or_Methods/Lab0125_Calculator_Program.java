package ex_13_Functions_Or_Methods;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.Scanner;
public class Lab0125_Calculator_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = readInt(sc, "Enter a number");
        int b = readInt(sc, "Enter a second number");
        int result_sum = sum(a,b);
        int result_sub = sum(a,b);
        int result_mul = sum(a,b);
        int result_div = sum(a,b);
        int result_modu = sum(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_modu);

        sc.close();
    }
    static int readInt(Scanner sc, String prompt)
    {
        System.out.println(prompt);
        if(sc.hasNextInt())
        {
            return sc.nextInt();
        }
        else
        {
            System.out.println("Enter integer value only");
            System.exit(0);
            return 0;
        }
    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }

    static int div(int a, int b)
    {
        return a/b;
    }

    static int mul(int a, int b)
    {
        return a*b;
    }
    static int modules(int a, int b)
    {
        return a%b;
    }

}
