package ex_15_Array;

public class Lab0145_Array_01 {
    public static void main(String[] args) {
        int marks[]={1,2,3,4,5,6,7,8};
        //2nd way..
        int []marks_1 = {2,34,7,7,8,4};
        int marks_2[]=new int[3];//Fixed size
        //what will be the output?
        System.out.println(marks[0]); //return 1
        System.out.println(marks_2[0]);//return 0 as we have declared only but not assigned
        //by default the value will be 0

        //if the array is integer type then the default value will be 0
        //if the array is string type then the default value is null
    }
}
