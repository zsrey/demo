package indi.zsr.test.four;

//定义外部类Outer
class Outer{
    int m =0;
    void  test1(){
        System.out.println("外部类成员方法");
    }
    //定义一个内部类
    class Inner{
        int n =1;
        //定义内部类方法，访问外部类成员变量和方法
        void show1(){
            System.out.println("外部成员变量m="+m);
        }
        void show2(){
            System.out.println("内部类成员方法");
        }
    }

    //定义外部类方法，访问内部类变量和方法
    void  test2(){
        Inner inner =new Inner();
        System.out.println("内部成员变量n"+inner.n);
        inner.show2();
    }
}

public class Example18 {
    public static void main(String[] args) {
        Outer outer=new Outer();

        Outer.Inner inner=outer.new Inner();
        inner.show1();
        inner.show2();
        outer.test2();

    }
}
