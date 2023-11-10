public class A extends B {

    int age;

    public static void main(String[] args){
        A a = new A();
        //a.age = 500;
        B b = new B();
        //b.age 对象b调用自己的私有方法age时会报错
        //b.setAge(100);
        //b.getAge();

        B c = new A();
        a.getAge();
        a.setAge(19);



    }
}
