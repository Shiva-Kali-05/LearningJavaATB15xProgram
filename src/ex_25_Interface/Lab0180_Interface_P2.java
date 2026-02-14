package ex_25_Interface;

public class Lab0180_Interface_P2 {
}

interface Father1
{
    //incomplete methods like,
    void abc1();
    void Money();
}
//can we have multiple interfaces also? yes we can have

interface Father2
{
    public void Money();
}
// can we inherit one class with multiple interfaces? yes

abstract class Mother
{
    abstract void Money();
}

class Son extends Mother implements Father1,Father2  //Multiple inheritance
{
    //we have two incomplete methods in class I1 and I2 so we need to complete them if you implements
    @Override
    public void abc1() {

    }

    @Override
    public void Money() {
        System.out.println("This is son method");
    }



}