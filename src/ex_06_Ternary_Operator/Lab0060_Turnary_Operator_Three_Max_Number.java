package ex_06_Ternary_Operator;

public class    Lab0060_Turnary_Operator_Three_Max_Number {
    public static void main(String[] args) {
        int n1 = 45;
        int n2=125;
        int n3 = 36;
        String result = (n1>n2 && n1>n3) ? "n1 is greater" : (n2>n1 && n2>n3)? "n2 is greater" : "n3 is greater";
        System.out.println(result);
    }
}
