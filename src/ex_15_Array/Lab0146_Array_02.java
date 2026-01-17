package ex_15_Array;

public class Lab0146_Array_02 {
    public static void main(String[] args) {
        //What is the output ?
        String names[]=new String[3];
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //o/p will be null bcoz, the default value of string is null

        //if we put a value then it will print
        names[0]="Nihal";
        names[1]="Shiva";
        names[0]="Shiv";
        System.out.println();
        System.out.println(names[0]);//this will print the latest value of index 0

    }
}
