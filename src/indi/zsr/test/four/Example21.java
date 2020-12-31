package indi.zsr.test.four;
//匿名内部类
//在java中调用某个方法时，如果该方法的参数是一个接口类型，除了可以传入一个参数接口实现类，还可以使用匿名内部类实现接口来作为该方法的参数

//定义动物类接口
 interface Animal21{
     void shout();
 }


public class Example21 {

     //定义静态方法animalShout，接受接口类型参数
    public static void animalShout(Animal21 an){
        an.shout(); //调用传入对象an的shout()方法
    }

    public static void main(String[] args) {
        String Name="小花";
        animalShout(new Animal21() {
            @Override
            //实现shout方法
            public void shout() {
                //JDK8开始，局部内部类、匿名类、匿名内部类可以访问非final
                System.out.println(Name+"喵喵。。");
            }
        });
    }
}
