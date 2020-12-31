package indi.zsr.test.other;

public class Woman extends Person {

    @Override
    public void eat() {
        System.out.println("女人吃东西");
    }

    @Override
    public void walk() {
        System.out.println("女人走路");
    }
    public void OtherForWoman(){
        System.out.println("女人其他方法");
    }
}
