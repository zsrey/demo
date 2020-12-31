package indi.zsr.test.six;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 聚合操作
 * 1.将原始集合或者数组对象转化那位Stream流对象
 * 2.对Stream流对象中的元素进行一系列的过滤，、查找等中间操作，然后仍然返回一个Stream流对象
 * 3.duiStream流进行遍历、统计、收集等终结操作，获取想要的结果
 * */
public class Example31 {
    public static void main(String[] args) {
        //创建一个list对象
        List<String> list =new ArrayList<>();
        list.add("张三");
        list.add("汪王");
        list.add("李四");
        //创建一个Stream对象
        Stream<String> stream =list.stream();
        //2.对Stream流中的元素分别进行过滤截取操作
        Stream<String> stream1=stream.filter(i ->i.startsWith("张"));
        Stream<String> stream2 =stream1.limit(2);
        //3.对Stream 流中的元素进行终结操作，进行遍历输出
        stream2.forEach(j-> System.out.println(j));
        System.out.println("======");
        list.stream().filter(i->i.startsWith("张"))//链式表达式
                .limit(2)
                .forEach(j-> System.out.println(j));
        //对集合中的元素使用Stream流的形式进行过滤filter 、截取limit ，并进行遍历输出
        //
    }
}
