package ex_11_While_Loop;

public class Lab0115_Factorial_Using_while_loop_Interview4 {
    public static void main(String[] args) {
        int number =4;
        int fact =1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial number :" +fact);
    }
}
