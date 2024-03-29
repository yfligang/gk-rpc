/*
集合ArrayList的使用
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test0001 {
    //使用main方法
    public static void main(String[] args){
        //新建一个集合并填充元素
        List<String> listStr = new ArrayList<>();
        listStr.add("China");
        listStr.add("USA");
        listStr.add("Hongkong");
        listStr.add("TaiWan");

        //直接打印集合listStr中的元素
        System.out.println("直接打印集合中的元素: " + listStr);
        //使用循环将集合中的元素都取出来，可以使用for循环
        System.out.print("使用循环将集合中的元素都取出来: ");
        for (int i = 0;i < listStr.size(); i++){
            System.out.print(listStr.get(i) + ",");
        }
        System.out.println("=======");
        //使用迭代器获取集合中的所有元素
        Iterator<String> it = listStr.iterator();
        System.out.println(it); //因为it为集合的对象，所以打印出来的是地址

        //如果集合中有元素，就打印出来
        System.out.println("使用while循环将集合中元素取出: ");
        while (it.hasNext()){
            System.out.print(it.next() + " ,");
        }
        System.out.println("");

        /*
        使用remove()方法移除集合中的元素  移除最后访问的元素
        如上面将集合打印出来，最后打印出来的就是TaiWan
        那么移除的就是TaiWan
         */

        //先调用next()方法
        Iterator it2 = listStr.iterator();
        while (it2.hasNext()){
            Object obj = it2.next();
            if ("TaiWan".equals(obj)){
                it2.remove();
            }else {
                System.out.print(obj + " ,");
            }

        }
//        System.out.println("");
//        //
//        while (it.hasNext()){
//            System.out.print(it.next() + " ,");
//        }
    }
}
