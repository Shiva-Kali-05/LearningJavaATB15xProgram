package ex_16_2Dimentional_Array;

public class Lab0160_Second_Highest_Array {
    public static void main(String[] args) {
        int numbers[] = {2, 5, 48, 26, 71, 8, 38, 28, 78};
        int highest = 0;
        int second_highest = 0;
        for (int num : numbers) {
            if (num > highest) {
                second_highest = highest;
                highest = num;
            } else if (num > second_highest && num != highest) {
                second_highest = num;

            }

        }
        System.out.println(second_highest);
    }
}
