/*
  比较两个字符串，并返回字符串中第一个字母ASCII的差值
  如果参数字符串等于此字符串，则返回值 0；
  如果此字符串小于字符串参数，则返回一个小于 0 的值；
  如果此字符串大于字符串参数，则返回一个大于 0 的值。
 */
public class CompareToLearn {

    public static void main(String args[]){
        String str = "Hello World";
        String anotherStr = "hello world";
        Object object = str;

        System.out.println("1: " + str.compareTo(anotherStr));
        System.out.println("2: " + str.compareToIgnoreCase(anotherStr)); //忽略大小写
        System.out.println("3: " + str.compareTo(object.toString()));

    }

}
