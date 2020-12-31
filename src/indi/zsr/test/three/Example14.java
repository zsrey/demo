package indi.zsr.test.three;

class Person14{
    static {
            System.out.println("执行了Person14中的静态代码块");
    }
}
public class Example14 {
    static {
        System.out.println("执行了Example14中的静态代码块");
    }
    public static void main(String[] args) {

        Person14 p=new Person14();
        Person14 p2=new Person14();

    }
}
