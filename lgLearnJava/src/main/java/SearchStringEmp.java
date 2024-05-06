/*
    在字符串中查找子字符串出现的位置，如果存在,返回字符串出现的位置（第一位为0）
    如果不存在返回 -1
 */
public class SearchStringEmp {

    public static void main(String[] args){
        String str1 = "Hello, what is your name?";
        String str2 = "ww";
        String str3 = "your";
        SearchStringEmp sse = new SearchStringEmp();
        sse.isExist(str1,str2);
        sse.isExist(str1,str3);
    }

    public void isExist(String strOriginal, String StrNew){
        int index = strOriginal.indexOf(StrNew);
        if (index == -1){
            System.out.println("没有找到字符串: " + StrNew);
        }else {
            System.out.println(StrNew + "的字符串位置: " + index);
        }
    }
}
