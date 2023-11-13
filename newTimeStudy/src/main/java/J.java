public class J extends H {

    /*
    通过调用H中的get和set方法来解决
     */
    public static void main(String[] args){
        J j = new J();
        j.method();

    }

    public void method(){
        H h = new H();
        h.setId(100101L);
        h.getId();
        h.setName("李大军");
        h.getName();
        h.setAge(11);
        h.getAge();
        h.setSex(null);
        h.isSex();

    }

}
