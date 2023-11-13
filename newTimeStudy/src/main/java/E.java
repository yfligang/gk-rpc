public class E {

    //封装N个属性
    private int age;
    private String name;
    private int score;
    private double height;
    private long id;

    public void setAge(int age) {
        //招聘需求只招16岁以上和60岁以下的
        if (age < 16){
            System.out.println("对不起，只招16岁以上");
        }else if (age > 60){
            System.out.println("对不起，只招60岁以下");
        }
        this.age = age;
        System.out.println("您的年龄为: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        if (name == null){
            System.out.println("请填写姓名!");
        }else {
            this.name = name;
        }

    }

    public String getName() {
        System.out.println("您的姓名为: " + name);
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        System.out.println("您的分数为: " + score);
        return score;
    }

    public void setHeight(double height) {
        //如果身高为0或者没有填写身高
        if ((height < 0) || (Double.isNaN(height))){
            System.out.println("请输入您的身高!");
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setNum(int age,String name,int score,double height,long id){
        E e = new E();
        if (age < 16){
            System.out.println("用户年龄不能小于16");
        }else if (age > 60){
            System.out.println("用户年龄不能大于60");
        }else {
            setAge(age);
            age = e.getAge();
            System.out.println(age);
        }
        setName(name);
        name = e.getName();
        System.out.println(name);
    }

    //应该是在单个的方法中添加逻辑

    public void method(int age,String name,int score,double height,long id){
        E e = new E();
//        age = e.getAge();
//        name = e.getName();
//        score = e.getScore();
//        height = e.getHeight();
//        id = e.getId();
        this.age = age;
        this.name = name;
        this.score = score;
        this.height = height;
        this.id = id;

//        System.out.println("年龄为: " + age + "\n" + "姓名为: " + name + "\n" +"分数为: " + score
//        + "\n" + "身高为: " + height + "\n" + "id值为: " + id);

        System.out.println("=======================");

//        System.out.println(e.getAge() + "\n" + e.getScore() + "\n" + e.getHeight()
//        + "\n" + e.getId() + "\n" + e.getName());

    }



    public static void main(String[] args){
        E e = new E();
        e.setNum(30,"王子",88,172.5,100109);
    }
}
