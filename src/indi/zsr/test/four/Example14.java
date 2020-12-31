package indi.zsr.test.four;

interface Animal14{
    int ID=1;
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

//定义LandAnimal 并继承Animal接口
interface  LandAnimal extends  Animal14{
      void run();
}

class Dog14 implements   LandAnimal{
    public void run(){
        System.out.println("狗在地上跑");
    }
    public void breathe(){
        System.out.println("狗在呼吸");
    }
}
/**
 * 1.JDK8之前，接口中的方法都必需是抽象的，并且方法不能包含方法体。在调用抽象方法时，必须通过接口的实现类的对象才能调用实现方法
 *     从JDK8开始，接口中的方法除了包含抽象方法外，还包含默认方法和静态方法，默认方法和静态方法都可以有方法体，并且静态方法可以直接通过“接口。方法名”来调用
 * 2.当一个类实现接口时，如果这个类是抽象类，只需要实现接口中的部分抽象方法即可，否则需要实现接口中的所有抽象方法
 * 3.一个类可以通过implements关键字同时实现多个接口，被实现的的哟个接口之间要用英文逗号隔开
 * 4.接口可继承接口，并可多继承接口，但类只能单继承,类可以实现多个接口
 * 5.一个类在继承一个类的同时还可以实现接口，此时，extends关键字必需位于implements关键字之前
 * */
public class Example14 {
    public static void main(String[] args) {
        System.out.println(Animal14.ID);
        Dog14 dog14=new Dog14();
        dog14.run();
        dog14.breathe();
        dog14.getType("犬类");
    }
}
