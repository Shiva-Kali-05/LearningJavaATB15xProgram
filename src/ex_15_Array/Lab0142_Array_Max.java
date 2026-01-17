package ex_15_Array;

public class Lab0142_Array_Max {
    public static void main(String[] args) {
        int marks [] = {94,95,78,92,97,94};
       // System.out.println(marks[0]); it will print first value
        int max=0;
        for(int i = 0;i <marks.length;i++)
        {
           if(marks[i]>max)
            max = marks[i];
        }
        System.out.println(max);
    }
}
