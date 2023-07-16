import sun.lwawt.macosx.CSystemTray;

import java.util.HashMap;
import java.util.Map;

public class Test001 {

    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"Google");
        map.put(2,"Baidu");
        map.put(3,"Microsoft");
        map.put(4,"JD");

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
