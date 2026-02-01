package ex_20_OOPs_Encapsulation;

import javax.security.auth.login.CredentialNotFoundException;

public class Lab0173_RunnerClass {
    public static void main(String[] args) {
        ICICIBank_Turbhe jagan = new ICICIBank_Turbhe("Pankaj",1000);
        long current_balance = jagan.getCust_balance();
        System.out.println(current_balance);

    }
}
class ICICIBank_Turbhe
{
    private String customer_name;
    private Long customer_balance;

    public long getCust_balance()
    {
        return customer_balance;
    }

    public long setCust_balance(long customer_balance)
    {
        return customer_balance;
    }

    public ICICIBank_Turbhe(String customer_name,long customer_balance)
    {
        this.customer_name=customer_name;
        this.customer_balance=customer_balance;
    }

}