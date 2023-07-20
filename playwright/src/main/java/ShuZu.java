import java.util.HashMap;

public class ShuZu {
    //HashMap中的clear方法
    public static void main(String[] args){
        //创建一个HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        //判断map中是否为空
        if (hashMap.isEmpty()){
            return; //只要为true, 后面都不运行了
        }
        //向map中添加键值对
        hashMap.put(1,"China");
        hashMap.put(2,"USA");
        hashMap.put(3,"Russia");
        hashMap.put(4,"UK");
        hashMap.put(5,"India");

        //打印map中的值//打印map中的值
        System.out.println(hashMap);


        for (int i = 0; i < 10; i++) {

        }

        //打印map中的所有键
        System.out.print("map中的键有: ");
        for (Integer num:hashMap.keySet()
             ) {
            System.out.print(num + ",");
        }

        //清除map中的数值
        hashMap.clear();
        System.out.println("map中的数值为: ");
        System.out.println(hashMap);




    }
}
