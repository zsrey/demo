package indi.zsr.test.four;

@FunctionalInterface
interface Printable {
    void print(String str);
}

class StringUtils {
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}

public class Example25 {
    private static void printUpper(String text, Printable pt) {
        pt.print(text);
    }

    public static void main(String[] args) {
        StringUtils stu = new StringUtils();
        //正常
        printUpper("Hello", new Printable() {
            @Override
            public void print(String str) {
                stu.printUpperCase(str);
            }
        });
        //使用lambda表达式
        printUpper("Hello",t->stu.printUpperCase(t));
        //使用方法引用的方式
        printUpper("Hello",stu::printUpperCase);

    }
}
