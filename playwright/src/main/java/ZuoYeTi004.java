import java.util.Scanner;

public class ZuoYeTi004 {
    /*
    判断一个整数是否是水仙花数
    水仙花数是指一个3位数，其各个位上数字立方和等于其本身
    例如: 153 = 1*1*1 + 5*5*5 + 3*3*3
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()){
            if (isShuiXianHua(sc.nextInt())){
                System.out.println("是水仙花数");
            }else {
                System.out.println("不是水仙花数");
            }
        }else {
            System.out.println("请输入正常三位数");
        }
    }

    public static boolean isShuiXianHua(int num){
        int a = num / 100; //整除后的结果为百位数字
        int b = (num / 10) % 10;
        int c = num % 10 ; //个位上的数字

        if (num == (a*a*a + b*b*b + c*c*c)){
            return true;
        }else {
            return false;
        }
    }

}
