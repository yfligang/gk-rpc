public class ZuoYeTi002 {
    /*
    实现判断一个整数，属于哪个范围
    大于0 小于0 等于0
     */

    public static void main(String[] args){
        bl(100);
        bl(-100);
        bl(0);
    }

    public static boolean bl(int num){
        if (num > 0){
            System.out.println("输入的为正整数 " + num);
            return true;
        }else if (num < 0){
            System.out.println("输入的为负整数 " + num);
            return false;
        }else {
            System.out.println("输入的数为0");
            return true;
        }
    }
}
