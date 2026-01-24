package ex_17_OOPs_Concepts;

public class TestClass {
    public static void main(String[] args) {
        String driver=null; //initialization
        LoginPage lp = new LoginPage(driver);
        lp.Login();
    }
}
