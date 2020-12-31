package indi.zsr.test.other;

/**
 * 多态练习测试2
 * */
public class DuoTai5 {
    public static void main(String[] args) {
        Base1 base =new Sub1();
        base.add(1,2,3);//1.输出什么

        Sub1 s =(Sub1)base;
        s.add(1,2,3);//2.输出什么
    }
}
class Base1{
    public  void add(int a,int ... arr){
        System.out.println("base1");
    }
}

class Sub1 extends Base1{
    public void add(int a ,int [] arr){
        System.out.println("sub_1");
    }
    public  void add(int a ,int b ,int c){
        System.out.println("sub_2");
    }
}
