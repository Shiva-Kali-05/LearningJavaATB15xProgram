package ex_19_OOPs_Polymorphism.Method_Overloading;

public class Lab0166_Realtime_Automation {
    public static void main(String[] args) {
    WebAutomation w = new WebAutomation();
    w.OpenBrowser();//default
    w.OpenBrowser("Chrome");//parameterised
    }
}

class WebAutomation
{
    void OpenBrowser()
    {
        System.out.println("default browser");
    }
    void OpenBrowser(String browser)
    {
        System.out.println("Starting browser" +browser);
    }
}