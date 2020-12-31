package indi.zsr.test.four;
//定义动物类接口
interface  Animal22{
    void shout();
//    void eat();
}

public class Example22 {
    //定义静态方法animalShout，接受接口类型参数
    public static void animalShout(Animal22 an){
        an.shout(); //调用传入对象an的shout()方法
    }

    public static void main(String[] args) {
        String Name="小花";
        //1.定义匿名内部类作为参数传递给animalShout方法
        animalShout(new Animal22() {
            @Override
            public void shout() {
                System.out.println("");
            }
//            @Override
//            public void eat() {
//                System.out.println("");
//            }
        });
        //2.使用Lambda表达式作为参数传递给animalShout方法
        animalShout( ()-> System.out.println("Lambda 表达式输出"+Name));
    }
}
