public class C {

    private int age;

    //获取age的属性值，通过get方法获取
    public int getAge(){
        return age;
    }

    //可以通过set方法设置age的值
    public void setAge(int age){
        if (age < 30){
            age = 20;
        }else {
            this.age = age; //将age值复制给类属性的age值
        }
    }

    public static void main(String[] args){

    }
}
