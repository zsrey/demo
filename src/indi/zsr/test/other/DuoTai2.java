package indi.zsr.test.other;

import java.util.Random;
/**
 * 多态收运行时行为测试
 * */
public class DuoTai2 {
    public static void main(String[] args) {
        int key=new Random().nextInt(3);
        System.out.println(key);
        //右边在运行时才确定，所以为运行时多态
        Animal animal =getInstance(key);
        animal.eat();
    }

    public static  Animal getInstance(int key){
        switch (key){
            case 0:
                return new Cat();
            case 1:
                return  new Dog();
            default:
                return new Sheep();
        }
    }
}

//父类
  class  Animal {

    void eat(){

        System.out.println("吃东西");
    }

}

class  Cat extends Animal {

    @Override
    void eat() {
        System.out.println("猫吃东西");
    }
}

class  Dog extends Animal{
    @Override
    void eat() {
        System.out.println("狗吃东西");
    }
}

class  Sheep extends Animal{
    @Override
    void eat() {
        System.out.println("养吃东西");
    }
}

