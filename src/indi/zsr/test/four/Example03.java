package indi.zsr.test.four;

class Animal3{
    String Name="动物";
    void shout(){
        System.out.println("动物发出叫声");
    }

}
class Dog3 extends Animal3{
    String Name="犬类";
    void shout(){
        super.shout();
    }
    void printName(){
        System.out.println("Name="+super.Name);
    }
}
public class Example03 {
    public static void main(String[] args) {
        Dog3 dog3=new Dog3();
        dog3.shout();
        dog3.printName();
    }
}
