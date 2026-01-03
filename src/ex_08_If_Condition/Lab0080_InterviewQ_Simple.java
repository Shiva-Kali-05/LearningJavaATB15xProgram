package ex_08_If_Condition;

public class Lab0080_InterviewQ_Simple {
        public static void main(String[] args) {
            int a=5;
            int b= a++;
            int c= ++a;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

            //Line          a  value        b value     c value
           // 1                  5               no           no
            //2                 5+1=6                  5           no
            //3                 6+1=7           5               7
            //a= 7
            //b =5
            // c=7


    }
}
