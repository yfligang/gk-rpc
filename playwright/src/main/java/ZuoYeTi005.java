public class ZuoYeTi005 {
    /*
    输出1-100之间的不能被5整除的数，每5个一行
     */

    public static void main(String[] args){
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0){ //不能被5整除的数
                num++;
                if (num % 5 == 0){
                    System.out.println();
                }
                System.out.print(i + " ");

            }
        }
    }
}
