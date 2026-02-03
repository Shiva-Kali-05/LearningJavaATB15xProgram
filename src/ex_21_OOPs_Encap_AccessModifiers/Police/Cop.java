package ex_21_OOPs_Encap_AccessModifiers.Police;

public class Cop {
    private int gun;
    private String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }
        protected void canIShoot()
        {
            System.out.println("Yes you can shoot");
        }
        void defaultMethod()
        {
            System.out.println("just a default method");
        }

}

