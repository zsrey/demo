package indi.zsr.test.four;

class Animal2 {
    void shout(){
        System.out.println("动物发出叫声");
    }
}
class Dog2 extends Animal2{
    void shout(){
        System.out.println("汪汪汪");
    }
}

public class Example02 {
    public static void main(String[] args) {
        Dog2 dog=new Dog2();
        dog.shout();
    }
}
