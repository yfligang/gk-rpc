public class LowcaseChange {
    /*
        Java 实例 - 字符串小写转大写
     */
    public static void main(String[] args){
        LowcaseChange lc = new LowcaseChange();
        lc.lowerCase("shehuizhuyihaoshehuizhuyiguojiarenmin");
    }

    public void lowerCase(String str){
        String strNew = str.toUpperCase();
        System.out.println(strNew);
    }
}
