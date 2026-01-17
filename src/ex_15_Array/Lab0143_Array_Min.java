package ex_15_Array;

public class Lab0143_Array_Min {
    public static void main(String[] args) {
        int marks[]={98,58,68,24,97,24,37,58,18,68,49};
        int min=marks[0];
        //int count = marks.length;//it will give the length
        //System.out.println(count);
        for(int i=0; i<marks.length;i++)
        {
            if(marks[i]<min) //condition for checking minimum value
            {
                min = marks[i];
            }
        }
        System.out.println("Minimum number is : " +min);

    }
}
