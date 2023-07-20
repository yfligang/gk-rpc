import sun.lwawt.macosx.CSystemTray;

import java.util.HashMap;
import java.util.Map;

public class Test001 {

    public static void main(String[] args){
        //泛型中的数据类型是引用数据类型，基础类型对应包装类
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"Google");
        map.put(2,"Baidu");
        map.put(3,"Microsoft");
        map.put(4,"JD");

        //访问HashMap中第2和第3个元素
        System.out.println("第2个元素的key: " + map.keySet().iterator().next());

        //打印map中的所有key
        System.out.print("map中的key为: ");
        for (int num:map.keySet()
             ) {
            System.out.print(num + ",");
        }

        System.out.println();

        //打印map中所有的value
        System.out.print("map中所有的value为: ");
        for (String str:map.values()
             ) {
            System.out.print(str + ",");
        }
    }
}
