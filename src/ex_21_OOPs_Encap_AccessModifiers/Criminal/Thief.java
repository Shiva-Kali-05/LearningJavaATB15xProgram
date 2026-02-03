package ex_21_OOPs_Encap_AccessModifiers.Criminal;

import ex_21_OOPs_Encap_AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cp = new Cop(100);
        //cp.canIShoot();// thief can shoot as it is declared as public
        //System.out.println(cp.gun);

    }
}
