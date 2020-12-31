package indi.zsr.test.six;

import java.util.HashSet;
//set集合
/**
 * set添加元素是，首先调用当前存入元素的hashCode()方法获取对象的哈希值
 *然后根据对象的哈希值计算出一个存储位置
 * 如果该位置上没有元素，则直接将元素存入；如果该位置上有存在，则会调用equals()方法让当前存入的元素依次和该位置上的元素进行比较
 * 如果返回的结果为false就将该元素存入集合，返回的结果为true则说明有重复元素，就将元素舍弃
 * */
public class Example09 {
    public static void main(String[] args) {
        HashSet set =new HashSet();
        set.add("Jack");
        set.add("Eve");
        set.add("Jack");//为set添加重复元素
        set.add("Rose");

        //遍历循环出set集合的元素
        set.forEach(obj-> System.out.println(obj));

    }
}
