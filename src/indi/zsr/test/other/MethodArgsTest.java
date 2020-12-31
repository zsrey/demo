package indi.zsr.test.other;
/**
 * 多个形参的定义
 * */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test =new MethodArgsTest();

        test.show(1);
        test.show();
        test.show("s","s1");
        test.show("");
    }

    public void  show(int i){}

    public void show(String str){}

    public void show(String ... str){}

    //同上 编译不通过
    //public void show(String[] arg){}

    //Vararg parameter must be the last in the list
    //public void show(String ... str,int i){}
}
