package indi.zsr.test.other;

public class Man extends Person {
    int id= 1002;

    @Override
    public void eat() {
        //super.eat();
        System.out.println("男人吃东西");
    }

    @Override
    public void walk() {
        //super.walk();
        System.out.println("男人走路");
    }
    public void OtherForMan(){
        System.out.println("男人其他方法");
    }
}
