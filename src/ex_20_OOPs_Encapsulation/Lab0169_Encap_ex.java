package ex_20_OOPs_Encapsulation;

public class Lab0169_Encap_ex {
    public static void main(String[] args) {
//someone is created an object & changed the password
        SettlementLogin st = new SettlementLogin("shivapos", "Asdf@1234");
        System.out.println(st.password);
        st.password="Zxcv@123"; // here password changed
        System.out.println(st.password);
        st.username="sachin";//here username is changed
        System.out.println(st.username);
        // here encapsulation comes into the picture
        // we need to hide the variables, it should be ecapsulated, it means don't allow to access
        //your variables to anyone

    }
}

class SettlementLogin
{
    public String username;
    public String password;
    //above are out instance variables

    //now will create a constructor

    public SettlementLogin(String username, String password)
    {
        this.username="username";
        this.password="password";
    }
}