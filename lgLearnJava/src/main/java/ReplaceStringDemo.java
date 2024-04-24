/*
    替换字符串中的字符
 */
public class ReplaceStringDemo {
    //给你一个字符，需要替换下字符串中的字符
    public static void main(String[] args){
        String str1 = "What is your name?";
        String str2 = str1.replace("h","12");
        System.out.println("替换后的字符串: " + str2);

        String str3 = "LuoLuo TuoMaXi LuoLuo TuoMAXi";
        String str4 = str3.replaceFirst("Luo","China");
        System.out.println("替换首个的展示: " + str4);
        String str5 = str3.replaceAll("Luo","Light");
        System.out.println("替换全部的展示: " + str5);
    }

}
