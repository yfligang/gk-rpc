public class StringOptimizationDemo {

    public static void main(String[] args){
        String[] variables = new String[50000];
        /*System.out.println(variables);
        for (String str:variables
             ) {
            System.out.println(str);
        }
        */
        for (int i = 0; i < 50000; i++) {
            variables[i] = "s" + i;
        }

        long startTime0 = System.currentTimeMillis();
        //运行完 50000个数后需要的时间

        for (int i = 0; i < 50000; i++) {
            variables[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();

        System.out.println("直接使用字符串: " + (endTime0 - startTime0) + "ms");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
        }

        long endTime1 = System.currentTimeMillis();

    }
}
