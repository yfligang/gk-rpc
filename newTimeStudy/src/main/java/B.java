public class B {

    private int age;

    //提供一个返回年龄的方法
    public int getAge() {
        //System.out.println("设置的年龄为: " + age);
        return age;
    }

    //提供一个处理年龄的方法
    public void setAge(int age){
        if (age < 80){
            age = 18;
            System.out.println("处理后的年龄" + age);
        }else {
            this.age = age;
            System.out.println("处理后的年龄" + age);
        }
    }

    public static void main(String[] args){

    }
}
