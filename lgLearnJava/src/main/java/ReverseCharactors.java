import java.util.Arrays;

/*
    反转函数 reverse的使用
 */
public class ReverseCharactors {
    //可以对数据进行反转
    public static void main(String[] args){

        String str1 = "Hello, my name is HanMeiMei";
        //对整个字符串进行反转(只有StringBuffer有reverse方法反转功能)
        String str2 = new StringBuffer(str1).reverse().toString();
        /*
            将StringBuffer类型的数据转为String类型的，需要加上 toString
         */
        System.out.println("反转后的字符串: " + str2);

        ReverseCharactors rc = new ReverseCharactors();
        rc.reverseNature("");
        /*
        char charArry = str1.charAt(0);
        System.out.println(charArry);
         */
    }
    /*
      单独写一个方法,倒转输入的内容
    */
    public void reverseNature(String str){
        char[] charArray = str.toCharArray();
        char[] charArrayReverse = new char[charArray.length];
        if (charArray.length <= 0){
            System.out.println("字符串不能为空");
            return;
        }else {
            for (int i = 0; i < charArray.length; i++) {
                charArrayReverse[i] = charArray[charArray.length -1 - i];
            }
            String strReverse = Arrays.toString(charArrayReverse);
            System.out.println("使用反转方法: " + strReverse);
        }

    }

}
