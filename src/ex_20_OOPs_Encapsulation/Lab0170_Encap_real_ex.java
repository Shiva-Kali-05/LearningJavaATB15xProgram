package ex_20_OOPs_Encapsulation;

public class Lab0170_Encap_real_ex {
    public static void main(String[] args) {
    POS_SettlementLogin psl= new POS_SettlementLogin("Sachin123","Asdf@1234");
       // System.out.println(psl.username); // this will not allow,as it is private in nature
       // System.out.println(psl.password);// this will not allow,as it is private in nature

    }
}

class POS_SettlementLogin
{
    private String username; //used private instead of public
    private String password;


    //Constructor
    public POS_SettlementLogin(String username, String password) {
        this.username = "ShivaPOS";
        this.password = "Apple@123";

    }
}
