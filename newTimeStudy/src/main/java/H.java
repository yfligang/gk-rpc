public class H {

    //创建私有属性
    private Long id;
    private String name;
    private int age;
    private Boolean sex = null;

    /*
    可以在set方法中添加一些逻辑
     */
    public void setId(Long id) {
        if (id < 0){
            System.out.println("id不能小于0");
        }else if (id.equals(null)){
            System.out.println("id不能为空");
        }else {
            this.id = id;
        }
    }

    public Long getId() {
        System.out.println("您的id为 " + id);
        return id;
    }

    public void setName(String name) {
        if (name.equals(null)){
            System.out.println("姓名不能为空");
        }else {
            this.name = name;
        }

    }

    public String getName() {
        System.out.println("您的姓名为 " + name);
        return name;
    }

    public void setAge(int age) {
        if (age < 16){
            System.out.println("年龄不能小于16岁");
            this.age = age;
        }else if (age > 60){
            System.out.println("年龄不能大于60岁");
            this.age = age;
        }else {
            this.age = age;
        }

    }

    public int getAge() {
        System.out.println("您的年龄为 " + age);
        return age;
    }

    public void setSex(Boolean sex) {
        if (sex == null){
            System.out.println("性别不能为空");

        }else if (sex == true){
            System.out.println("性别为男性");
            this.sex = sex;
        }else {
            System.out.println("性别为女性");
            this.sex = sex;
        }

    }

    //如果是布尔值，get方法就成为 isXxx
    public boolean isSex() {
        return sex;
    }
}
