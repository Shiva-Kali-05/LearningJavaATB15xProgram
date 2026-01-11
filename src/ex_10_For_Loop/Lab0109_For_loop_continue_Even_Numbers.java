package ex_10_For_Loop;

public class Lab0109_For_loop_continue_Even_Numbers {
    public static void main(String[] args) {
//        for (int i=0;i<=50;i++)
//        {
//            if(i%2==0)
//            {
//                continue; // it will not print even number, it will skip the even numbers
//            }
//            System.out.println("Even number " +i);
//        }

        for (int i=0;i<=50;i++)
        {
            if(i%2!=0)
            {
                continue; // if you want to print even number then will have to give ! not equal to.
                // Continue will work as revers in this case.
            }
            System.out.println("Even number " +i);
        }

    }
}
