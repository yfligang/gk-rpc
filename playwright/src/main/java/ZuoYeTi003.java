import java.util.Scanner;

import static com.sun.tools.doclint.Entity.and;
import static com.sun.tools.doclint.Entity.or;

public class ZuoYeTi003 {
    /*
    判断一个年份是否为闰年
    是否能被4整除且不能被100整除，或者能整除400
     */

    public static void main(String[] args){
        //用户输入年份
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()){
            if (isRunNian(sc.nextInt())){
                System.out.println("输入的年份为闰年");
            }else {
                System.out.println("输入的不是闰年");
            }
        }

    }

    public static boolean isRunNian(int year){
        if ((year % 4 == 0&& year % 100 !=0) || (year % 400 ==0)){
            return true;
        }else {
            return false;
        }
    }
}
