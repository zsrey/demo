package indi.zsr.test.three;
class Person{
    public  static  void say(){
        System.out.println("Hello");
    }
}
public class Example13 {
    public static void main(String[] args) {
        Person.say();
        Person p=new Person();
        p.say();
    }
}
