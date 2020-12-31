package indi.zsr.test.four;
//定义一个接口
@FunctionalInterface
interface PrintTest{
    void print(StringUtil su,String str);
}
//普通类 有个转为大写的方法
class StringUtil {
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}
public class Example27 {
    private static  void printUpper(StringUtil su,String text,PrintTest pt){
        pt.print(su,text);
    }
    public static void main(String[] args) {
        //正常
        printUpper(new StringUtil(), "Hello", new PrintTest() {
            @Override
            public void print(StringUtil su, String str) {
                su.printUpperCase(str);
            }
        });
        //使用lambda表达式
        printUpper(new StringUtil(),"Hello",(object,t)->object.printUpperCase(t));
        //使用方法引用的方式
        printUpper(new StringUtil(),"Hello",StringUtil::printUpperCase);
    }
}
