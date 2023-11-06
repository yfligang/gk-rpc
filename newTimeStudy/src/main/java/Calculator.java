import java.util.Scanner;

/*
 简易计算器项目
 */
public class Calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.println("请输入第一个数: ");
        num1 = sc.nextDouble();

        System.out.println("请输入运算符: (+、-、*、/)");
        operator = sc.next().charAt(0);

        System.out.println("请输入第二个数: ");
        num2 = sc.nextDouble();

        switch (operator) { //判断运算符
            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" +result);
                break;
            case '/':
                if (num2 == 0){ //判断除数是否为0
                    System.out.println("除数不能为0");
                }else {
                    result = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" +result);
                }
                break;
            default:
                System.out.println("运算符输入错误");


        }

    }
}
