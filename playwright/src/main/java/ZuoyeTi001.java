/*
需要 个参数
总钱数 = 100000
剩余钱数
经过路口次数，经过1次就+1

第一次剩余的钱 = 100000 - 100000*5/100
第二次剩余的钱 = (100000 - 100000*5/100) - (100000 - 100000*5/100)*5/100

 */

public class ZuoyeTi001 {

    //现金总数为 100000
    static int sum = 100000;

    public static void main(String[] args){
        //再创建一个参数，每次剩余的钱
        //收费次数从0开始
        int num = 0;
        while (sum > 1000){
            if (sum > 50000){
                sum = sum - sum*5/100 ;
                num++;
            }else {
                if (sum < 50000){
                    sum = sum - 1000;
                    num++;
                }
            }
        }
        System.out.println("交钱总次数: " + num);
        System.out.println("剩余钱数为: " + sum);



    }
}
