package indi.zsr.test.four;
//关于构造方法中super()
///**
// * 第一种情况 编译不通过
// * **/
// class A{
//    public A(String s){
//
//    }
//}
//class  B extends A{
//    /**如果一个类中没有写任何的构造方法，JVM会生成一个默认的无参构造方法。
//     * 在继承关系中，由于在子类的构造方法中，第一条语句默认为调用父类的无参构造方法（即默认为super()，一般这句话省略了）。
//     * 所以当在父类中定义了有参构造函数，都是没有定义无参构造函数时，IDE会强制要求我们定义一个相同参数类型的构造器。
//     *
//     在本例中JVM默认给B加了一个无参构造方法，而在这个方法中默认调用了super()，但是父类中并不存在该构造方法**/
//}

/**
 * 第二种情况：编译不通过
 */
class A {
    public  A(){
        System.out.println("父类无参构造函数");
    }

    public A(String s) {
        System.out.println("父类有参构造函数");
    }
}

class B extends A {
    public B(String s) {
        System.out.println("子类有参构造函数");
//        super(s);
    }
}

public class Example04 {
    public static void main(String[] args) {
//        A a =new A();
        B b=new B("s");

    }
}
