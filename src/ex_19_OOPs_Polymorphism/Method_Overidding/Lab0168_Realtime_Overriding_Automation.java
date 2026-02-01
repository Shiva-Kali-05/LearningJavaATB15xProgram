package ex_19_OOPs_Polymorphism.Method_Overidding;

public class Lab0168_Realtime_Overriding_Automation {
    public static void main(String[] args) {
//        ChromeTC ct = new ChromeTC();
//        ct.OpenBrowser();
//
//        Firefox fx = new Firefox();
//        fx.OpenBrowser();
//
//        CommnToAll all = new CommnToAll();
//        all.OpenBrowser();

        //Dynamic Dispatch
        CommnToAll dyna = new ChromeTC();
        dyna.OpenBrowser();//chrome

        CommnToAll dy = new Firefox();
        dy.OpenBrowser();//firefox


    }
}

class CommnToAll
{
    void OpenBrowser()
    {
        System.out.println("Starting Edge browser");
    }
}

class ChromeTC extends  CommnToAll
{
    @Override
    void OpenBrowser()
    {
        System.out.println("Starting Chrome browser");
    }
}
class Firefox extends CommnToAll
{
    @Override
    void OpenBrowser()
    {
        System.out.println("Starting Firefox browser");
    }
}