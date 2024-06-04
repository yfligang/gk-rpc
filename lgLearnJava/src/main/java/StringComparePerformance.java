/*
    通过创建字符串验证性能
 */
public class StringComparePerformance {

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        for (int i = 0; i < 500000; i++) {
            String str1 = "hello";
            String str2 = "world";
        }
        long endTime = System.currentTimeMillis();
        long periodTime = endTime - startTime;
        System.out.println("通过String关键词创建字符串: " + periodTime + "毫秒");
    }

    public void stringComparePerformanceTest(String str){

    }
}
