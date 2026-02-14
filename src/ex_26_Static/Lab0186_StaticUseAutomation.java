package ex_26_Static;

public class Lab0186_StaticUseAutomation {
    public static void main(String[] args) {
        //now anyone can use it
        Automation at = new Automation();
        System.out.println(at.driver);
        System.out.println(Automation.driver);
        Automation.driver="Firefox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);
    }
}
class Automation
{
    static String driver="chrome";
    static String driver2;
}