package wanda;

public class Test3 extends Test2 {

    public int a = 10;
    public int b = 20;

    void fun(){
        System.out.println(a); //这里a是指子类的a 为10
        System.out.println(super.a); //这里s是父类的a 为1
    }
}
