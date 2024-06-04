import java.sql.Time;

/*
    字符串优化
 */
public class CompareOptional {
    public static void main(String[] args) {
        String[] variables = new String[50000];
        for (int i = 0; i < 50000; i++) {
            variables[i] = "s" + i;
        }

        long startTime0 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = "hello";
        }

        long endTime0 = System.currentTimeMillis();
        System.out.println("直接使用字符串" + " " + (endTime0 - startTime0) + "ms");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            variables[i] = new String("hello");
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("使用new关键字 " + (endTime1 - startTime1) + "ms");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("Hello");
            variables[i] = variables[i].intern();

            long endTime2 = System.currentTimeMillis();
        }
    }
}
