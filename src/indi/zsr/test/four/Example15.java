package indi.zsr.test.four;

//定义抽象类animal
abstract class Animal15{
    //定义抽象方法
    abstract  void shout();
}

//定义Cat类继承animal 抽象类
class Cat extends  Animal15{
    //实现shout方法
    public  void shout (){
        System.out.println("喵喵。。。");
    }       
}
//定义Dog类继承Animal抽象类
class Dog15 extends Animal15{
    public void shout(){
        System.out.println("汪汪。。。");
    }
}
public class Example15 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog15 dog15=new Dog15();
        cat.shout();
        dog15.shout();
    }
}
