package ex_15_Array;

public class Lab0154_Task_2ndHighest_Array {
    public static void main(String[] args) {
        //Write a program to print 2nd highest number from the array.
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max = numbers[0];
        for(int i=1;i<numbers.length; i++)
        {
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
        }
        int Second_max = numbers[0];
        for(int i =0;i<numbers.length;i++)
        {
            if(numbers[i] != max && numbers[i]>Second_max)
            {
                Second_max = numbers[i];
            }
        }
        System.out.println("Second highest number is : " +Second_max);
    }
}
