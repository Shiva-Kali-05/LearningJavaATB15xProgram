package ex_22_OOPs_Abstraction_SuperKeyword;

public class Lab0174_Super {
    //Super keyword can access parent class variables, methods and constructors

}

class BaseClass
{
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }


    BaseClass()
    {
        System.out.println("Default constructor");
    }
    BaseClass(String browser)
    {
        this.browser = browser;
        System.out.println("Parameterised constructor");
    }
}

class TestClass extends BaseClass
{
    void test()
    {
        System.out.println("Normal Method");
    }
    TestClass()
    {
        super();// this will call the parent class constructer


    }
}
