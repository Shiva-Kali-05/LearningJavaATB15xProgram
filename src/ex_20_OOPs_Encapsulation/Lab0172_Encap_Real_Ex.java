package ex_20_OOPs_Encapsulation;

public class Lab0172_Encap_Real_Ex {
    public static void main(String[] args) {
    ICICIBank soubhagya = new ICICIBank("Shiva",100);
    long cust_balance1 = soubhagya.getCust_balance();
        System.out.println(cust_balance1);
        //System.out.println(ic.getCust_balance);//we cannot directly to the balance, it must use get balance method.
        soubhagya.setCust_balance(500,false);//this should not be allows.
        System.out.println(soubhagya.getCust_balance());


    }
}

class ICICIBank
{
    private String cust_name;
    private long cust_balance;

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public long getCust_balance() {
        return cust_balance;
    }

    public void setCust_balance(long cust_balance,boolean is_cashier) {
        if(is_cashier)
        {
            this.cust_balance = cust_balance;
        }
        else
        {
            System.out.println("Not allowed");
        }

    }

    public ICICIBank(String cust_name, long cust_balance) {
        this.cust_name = cust_name;
        this.cust_balance = cust_balance;
    }
}
