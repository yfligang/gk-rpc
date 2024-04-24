/*
   查找字符串最后一次出现的位置
   通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位
 */
public class FindLastPosition {

    public static void main(String args[]){
        String str1 = "What is your name?";
        String str2 = "na";

        int num = str1.lastIndexOf(str2);
        //需要判断下如果原有字符串不包含子字符串，即数值等于 -1时，提示 没有该子字符串
        if (num == -1){
            System.out.println("该子字符串不存在于原字符串中");
        } else {
            System.out.println("子字符串在原有字符串中的位置：" + num);
        }
    }
}
