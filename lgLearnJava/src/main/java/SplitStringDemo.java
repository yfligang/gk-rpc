/*
    使用split方法，通过指定分隔符将字符串分隔为数组
 */
public class SplitStringDemo {

    public static void main(String[] args){
        SplitStringDemo ssd = new SplitStringDemo();
        ssd.splitTest("What/are/you/talking/about?" , "/");
        /*
             按照给的字符串来进行分隔
         */
    }

    public void splitTest(String str1,String str2){
        //str1为原始字符串，str2为使用什么来分隔
        String[] strArray = str1.split(str2);
        //打印出字符串数组
        for (String str: strArray
             ) {
            System.out.println(str + ",");
        }
    }
}
