package indi.zsr.test.junit;

import org.junit.Test;

/**
 * 包装类的使用：
 * 1.java 提供了 8 种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 *
 * 2.掌握的： 基本数据类型、包装类、String三者之间的相互转换
 * */
public class WrapperTest {

    //String类型----》 基本数据类型
    @Test
    public void test5(){
        String str1="123";
        //强转需要父子关系--------  数值型包装类父类 Number类
        //int num1 =(int)str1;
        //Integer integer =(Integer);
    }

    //基本输一局类型、包装类 ----》 String类型：调用String重载的valueOf()
    @Test
    public  void test4(){
        int num1= 10;
        //方式1：连接运算
        String str1 =num1 +"";
        //方式2：调用String的valueOf(xxx)
        float f1 =12.3f;
        String str2=String.valueOf(f1);

        Double d1 =12.4;//包装类
        String str3=String.valueOf(d1);//传入object类型
    }

    /**
     * JDK 5.0 新特性，自动装箱和自动拆箱
     * */
    @Test
    public void test3(){
        int num =10;
        method(num); //基本数据类型可以传入method 自动装箱

        //自动装箱 ： 自动将基本数据类型转换为包装器类型
        Integer total = 99;

        //自动拆箱 ： 自动将基本数据类型转换为包装器类型
        int totalprim = total;

    }
    public void method(Object obj){}


    //包装类----》基本数据类型 ： 调用包装类的xxxValue()
    @Test
    public  void test2(){
        Integer integer=new Integer(12);
        int i1=integer.intValue();
        System.out.println(i1+1);

        Float f1=new Float(13.4);
        float f=f1.floatValue();
        System.out.println(f+ 1);
    }

    //基本数据类型----》 包装类：调用包装类的构造器
    @Test
    public  void test1(){
        int num1 =10;
        //基本数据类型不能直接toSting()
        //System.out.println(num1.toString());
        Integer in1=new Integer(num1);
        System.out.println(in1.toString());

        Integer in2=new Integer("123");
        System.out.println(in2.toString());

        //报异常
//        Integer in3 =new Integer("123abc");
//        System.out.println(in3.toString());

        Float f1=new Float(13.4);
        Float f2=new Float("13.4");

        Boolean b1=new Boolean("TruE");//
        Boolean b2=new Boolean("true123");//false

        class Order{
            boolean isOne;
            Boolean isTwo;
        }

        System.out.println(new Order().isOne);//默认值为 false
        System.out.println(new Order().isTwo);//默认值为 null

    }
}


