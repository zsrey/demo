package indi.zsr.test.other;

public class DuoTai3 {
    public static void main(String[] args) {
        Person p1 =new Man();
        //对象的多态只适用于方法，不适用于属性
        p1.eat();//输出子类的方法
        System.out.println(p1.id);//输出父类的id

    }
//    Throwable
//    Exception
}
