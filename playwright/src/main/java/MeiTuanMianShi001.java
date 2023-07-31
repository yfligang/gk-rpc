import java.util.Scanner;

public class MeiTuanMianShi001 {
    /*
    将给定的字符串，按照规则删除字符，输出删除后的字符串。
    删除规则为：相同字符连续，则删除
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                //j为移动指针，记录连续子川的尾部
                int j = i;
                //若后一个字符跟当前一样，则j后移一位
                while (j + 1 < str.length() && str.charAt(i) == str.charAt(i + 1))
                    j++;
                if (i == j)
                    sb.append(str.charAt(i));
                else
                    i = j;
                    //ij相等说明不是连续的
            }
            if (sb.toString().equals(""))
                System.out.println("no");
            else
                System.out.println(sb);
        }
    }
}
