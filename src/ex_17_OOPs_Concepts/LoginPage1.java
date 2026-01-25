package ex_17_OOPs_Concepts;

public class LoginPage1 {
    String email;
    String Password;
    String Submit;
    //Parameterised
    public LoginPage1(String email, String submit, String password)
    {
        this.email = email;
        Submit = submit;
        Password = password;
    }

    public LoginPage1(String email, String password)
    {
        this.email ="abc@gmail.com";
        this.Password="ghkl12";
    }
    public LoginPage1(String submit)
    {
        this.Submit = "Submit Button";
    }

    public LoginPage1()  //default constructor
    {
        System.out.println("Default Constructor");
    }

    public static void main(String[] args) {
        LoginPage1 lp = new LoginPage1();
        LoginPage1 lp1 = new LoginPage1("fskdfs@gamil.com", "Submitted","dfklk156");
        lp1.Submit="Submitted";
        lp1.email="fskdfs@gamil.com";
        lp1.Password="fkdjs";
        System.out.println(lp1.email);
        System.out.println(lp1.Password);
        System.out.println(lp1.Submit);

    }
}
