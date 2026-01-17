package ex_15_Array;

public class Lab0144_Array_declaration_alltype {
    public static void main(String[] args) {
        int marks[]={98,35,89,55,85,2,58,88,2,5,8};
        int []marks1 = {25,5,57,44,5,65,88,54,2,7};

        boolean is_married[]={true,false};
        String names[]={"Nihal","Shiva","Neetu"};
        //String names_1[]={"Nihal","Shiva","Neetu",35}; //different data type is not allowed
        float value [] = {3.14f,3.15f};
        float values[] = new float[3];
        values[0]=5.2f;
        values[1]=5315.25f;
        values[2]=123.24f;
       // values[3]=3.14f; // Index out of bound exception, size is given 3 only
        for(String name : names) //for each loop, in place of name you can use anything..
        {
            System.out.println(name);
        }
    }
}
