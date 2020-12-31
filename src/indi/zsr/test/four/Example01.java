package indi.zsr.test.four;

class Animal {
    String Name;
    //定义动物叫的方法
    void shout(){
        System.out.println("动物发出叫声");
    }
}
//定义子类
class Dog extends  Animal{
 public  void printName(){
     System.out.println("Name="+Name);
 }
}

public class Example01 {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.Name="沙皮狗";
        dog.shout();
        dog.printName();

    }
}
