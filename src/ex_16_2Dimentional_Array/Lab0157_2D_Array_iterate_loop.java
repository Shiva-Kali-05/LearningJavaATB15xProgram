package ex_16_2Dimentional_Array;

public class Lab0157_2D_Array_iterate_loop {
    public static void main(String[] args) {
        int [][] array=
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        for(int i = 0; i<= array.length;i++)
        {
            for(int j=0; j< array[i].length; j++)
            {
                System.out.print(array[i][j] +"|");
            }
            System.out.println("");
        }
    }
}
