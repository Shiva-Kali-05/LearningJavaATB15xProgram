package ex_20_OOPs_Encapsulation;

public class Lab0171_Encap_Getter_Setter {

    //In Java, private data members cannot be accessed directly from outside the class
    //by using getter and setter method,we can access the private or hidden data or encapsulated data.
    //Getter - to read the value
    //Setter - to modify the value
    // we are not accessing the private variable directly, we can access it through controlled method.
    public static void main(String[] args) {
        SettlementDemo sd = new SettlementDemo("skdkla","shiva");
        sd.getPassword();
        sd.setPassword("India");
        sd.getUsername();
        sd.setUsername("ShivaPos");

    }


}

class SettlementDemo
{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



    public SettlementDemo(String password, String username) {
        this.password = password;
        this.username = username;
    }
}