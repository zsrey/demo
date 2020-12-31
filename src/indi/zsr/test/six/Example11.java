package indi.zsr.test.six;

import java.util.TreeSet;

public class Example11 {
    public static void main(String[] args) {
        TreeSet treeSet =new TreeSet();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(12);
        System.out.println("创建的Treeset集合为："+treeSet);

        //获取首尾部元素
        System.out.println("TreeSet集合的首部元素为："+treeSet.first());
        System.out.println("TreeSet集合的尾部元素为："+treeSet.last());

        //比较并获取元素
        System.out.println("集合中小于或等于9的最大的一个元素为："+treeSet.floor(9));
        System.out.println("集合中大于10的最小的一个元素为："+treeSet.higher(10));
        System.out.println("集合中大于100的最小的一个元素为："+treeSet.higher(100));

        //删除元素
        Object first=treeSet.pollFirst();
        System.out.println("删除的第一个元素是："+first);
        System.out.println("删除的第一个元素后TreeSet集合变为："+treeSet);


    }
}
