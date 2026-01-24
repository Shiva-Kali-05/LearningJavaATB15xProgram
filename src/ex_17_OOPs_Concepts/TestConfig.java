package ex_17_OOPs_Concepts;

public class TestConfig {
    String browser;
    String environment;
    //Default constructor

    public TestConfig() {
        browser = "Chrome";
        environment = "QA";
    }

    public void display_Config()
    {
        System.out.println(browser + "-" + environment);
    }

    public static void main(String[] args) {
        TestConfig tc = new TestConfig();
        tc.display_Config();
    }
}



