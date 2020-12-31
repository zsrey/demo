package indi.zsr.test.four;

//定义接口
interface Animal13{
    //定义全局常量
    int ID=1;
    //定义抽象方法
    void breathe();
    //定义一个默认方法
    default void getType(String type){
        System.out.println("该动物属于"+type);
    }
    //定义一个静态方法
    static int getID(){
        return  Animal13.ID;
    }
}

//Dog类实现Animal接口
class Dog13 implements  Animal13{
    public  void  breathe(){
        System.out.println();
    }
}

public class Example13 {
    public static void main(String[] args) {
        System.out.println(Animal13.ID);
        Dog13 dog13=new Dog13();
        System.out.println(dog13.ID);
        //调用dog对象的breathe方法
        dog13.breathe();
        dog13.getType("犬科");
    }
}
