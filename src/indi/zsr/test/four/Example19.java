package indi.zsr.test.four;

//定义外部类Outer
class Outer_19{
    int m=0;
    void test1(){
        System.out.println("外部类成员方法");
    }
    void test2(){
        //1.定义局部内部类Inner ，在局部类中访问外部类变量和方法
        class Inner{
            int n=1;
            void show (){
                System.out.println("外部类变量m="+m);
                test1();
            }
        }

        //2.创建局部内部类的方法中，调用局部内部类变量和方法
        Inner inner =new Inner();
        System.out.println("局部内部类变量n="+inner.n);
        inner.show();
    }

}
public class Example19 {
    public static void main(String[] args) {
        Outer_19 outer =new Outer_19();
        outer.test2();  //通过外部类对象调用创建了局部内部类的方法
    }
}
