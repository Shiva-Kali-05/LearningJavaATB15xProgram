package ex_17_OOPs_Concepts;

public class BrowserSetup {
    String browserName;
    //Parameterised constructor

    public BrowserSetup(String browserName)
    {
        this.browserName = "Chrome";
    }
    public void launchbrowser()
    {
        System.out.println("Launching : " +browserName);
    }

    public static void main(String[] args) {
        BrowserSetup bs = new BrowserSetup("browserName");
        bs.launchbrowser();
    }
}
