package indi.zsr.test.six;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 集合对象有对应的集合类，可以通过集合类提供的静态方法创建Stream 流对象
 * 而数组数据没有对应的数组类，必需通过别的方法创建Stream流对象
 *  所有的Collections 集合都可以通过使用stream()静态方法获取Stream对象
 *  Stream接口中的of()静态方法可以获取基本类型包装类数组、引用类型数组和单个元素的Stream流对象
 *  Arrays数组工具类的stream()静态方法也可以获取数组元素的Stream流对象
 *
 *
 * 只针对单列集合Collections接口对象提供了stream()静态方法获取流对象
 * 并未对Map集合提供相关方法获取流对象，先通过Map集合的keySet()、values()、entrySet()方法转为单列Set集合
 * 再使用单列集合的stream()静态方法获取对应键值集合的Stream流对象
 * */
public class Example32 {
    public static void main(String[] args) {
        //1.创建一个数组
        Integer [] array ={1,2,5,8,9};
        List<Integer> list = Arrays.asList(array);// 该方法是将数组转化成List集合的方法。
        // 该方法适用于对象型数据的数组（String、Integer...）
        //不支持add()、remove()、clear()等方法
        //1.使用集合对象的stream()方法创建对象
        Stream<Integer> stream =list.stream();
        stream.forEach(i-> System.out.println(i+" "));
        System.out.println();

        //2.使用Stream接口的of()静态方法创建对象
        Stream<Integer> stream1 =Stream.of(array);
        stream1.forEach(i-> System.out.println(i+" "));
        System.out.println();

        //3.使用Array数组工具类的stream()静态方法来创建对象
        Stream<Integer> stream2 =Arrays.stream(array);
        stream2.forEach(i-> System.out.println(i+" "));


    }
}
