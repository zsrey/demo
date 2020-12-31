package indi.zsr.test.four;

abstract class Animal12{
    public abstract void shout();
}
class Dog12 extends  Animal12{
    public void shout(){
        System.out.println("汪汪...");
    }
}
public class Example12 {
    public static void main(String[] args) {
        Dog12 dog12=new Dog12();
        dog12.shout();
    }
}
