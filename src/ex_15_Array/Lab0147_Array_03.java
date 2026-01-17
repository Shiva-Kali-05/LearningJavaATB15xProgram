package ex_15_Array;

public class Lab0147_Array_03 {
    public static void main(String[] args) {
        //print one by one
        int marks[]={1,2,5,46,8,4,1,5};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);
      //  System.out.println(marks[8]);//ArrayIndexOutOfBoundsException
        System.out.println(marks.length);//it will give 8
        //this is not actually good way, we should use for each loop

        for(int mark:marks)
        {
            System.out.println(mark);
        }
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
