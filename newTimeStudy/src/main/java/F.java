public class F extends E {

    public static void main(String[] args){
        E e = new E();
        e.method(10,"李大军",95,177.5,100101);
    }

    public void method(int age,String name,int score,double height,long id){
        E e = new E();
        age = e.getAge();
        name = e.getName();
        score = e.getScore();
        height = e.getHeight();
        id = e.getId();
    }
}
