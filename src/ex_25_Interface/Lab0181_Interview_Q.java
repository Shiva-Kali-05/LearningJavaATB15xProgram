package ex_25_Interface;

public class Lab0181_Interview_Q {
}
//can we have interfaces like this?
interface I11{}
interface I12{}
class A1{}
class B1{}
//class Test extends A1,B1{}
class Test2 implements I11,I12{} // possible
//one extends and other implements is possible? Yes
class Test5 extends A1 implements I11,I12{}
//is it possible reverse? No
//class Test6 implements I12,I11 extends B1
