package indi.zsr.test.other;

/**
 * 向上转型测试
 * */
public class DuoTai1 {
    public static void main(String[] args) {
        //先将子类赋值给父类，再向下转型可以使用子类的方法(编译通过，运行通过)
//        Person p1 =new Man();
//
//        Man m1=(Man)p1;
//        m1.OtherForMan();

        //一开始实例化父类，再强转为子类，使用会报错（编译通过，运行不通过）
        Person p1 =new Person();

        Man m1=(Man)p1;
        m1.OtherForMan();
        if (p1 instanceof Man) {
            Man man = (Man) p1;
            
        }
        //编译通过
        Object obj =new Woman();
        Person p =(Person)obj;

    }
}
