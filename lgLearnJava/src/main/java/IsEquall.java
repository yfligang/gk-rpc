public class IsEquall {
    /*
        测试两个字符串区域是否相等
     */
    public static void main(String[] args){
        String str1 = "What is your name?";
        String str2 = "See you tomorrow";
        String str3 = "What is your name?";

        boolean isSame = str1.regionMatches(0,str2,0,str1.length());
        System.out.println(isSame);
        boolean isSameTrue = str1.regionMatches(true,0,str2,0,20);
        System.out.println(isSameTrue);
        boolean isSameTrueNew = str1.regionMatches(true,0,str3,0,str1.length());
        System.out.println(isSameTrueNew);
    }
}
