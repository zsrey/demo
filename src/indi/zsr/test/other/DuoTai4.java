package indi.zsr.test.other;

/**
 * 多态练习测试
 * 1.若子类重写了父类的方法，就以为着子类里定义的方法彻底覆盖了父类里的同名方法
 * 系统将不可能把父类里的方法转移到子类中
 * 2.对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量
 * 这个实例变量依然不可能覆盖父类中定义的实例变量
 * */
public class DuoTai4 {
    public static void main(String[] args) {
        Sub sub =new Sub();
        System.out.println(sub.count);//20
        sub.display();//20

        Base base=sub;//多态性
        //==类型不同的话会报错 两个都是引用类型比较地址值是否相同，
        System.out.println(sub==base);//true
        System.out.println(base.count);//10
        base.display();
    }
}
class Base {
    int count=10;
    public  void display(){
        System.out.println(this.count);
    }
}
class  Sub extends Base{
    int count=20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}
