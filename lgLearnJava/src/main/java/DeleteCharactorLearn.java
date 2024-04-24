/*
    删除字符串中的一个字符
    通过字符串函数 substring() 函数来删除字符串中的一个字符
    我们将功能封装在 removeCharAt 函数中。
 */
public class DeleteCharactorLearn {

    public static void main(String[] args){
        String str = "Are you OK?";
        String strNew = str.substring(7); //从第0个到第7个字符都删除
        String strNewInt = str.substring(1,2);//A you OK?
        System.out.println("删除字符后的展示为: " + strNew);
        System.out.println("展示为: " + strNewInt);

        DeleteCharactorLearn dcl = new DeleteCharactorLearn();
        dcl.removeCharactor("Who is your daddy",0,1);
    }

    //使用removeCharactor方法对substring方法进行封装,然后通过类的实例化进行调用
    public void removeCharactor(String str, int m,int n){
        String strNew = str.substring(m,n);
        System.out.println("通过实例化调用的方法: " + strNew);
    }

}
