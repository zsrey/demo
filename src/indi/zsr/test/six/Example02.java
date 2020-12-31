package indi.zsr.test.six;
//LinkedList相关

import java.util.LinkedList;
/**
 * LinkedList相关
 * */
public class Example02 {
    public static void main(String[] args) {
        //创建linkedlist集合
        LinkedList link=new LinkedList();
        //1添加元素
        link.add("sut1");
        link.add("stu2");
        System.out.println(link);//输出集合中的元素
        link.offer("offer");//向集合尾部追加元素
        link.push("push");//向集合头部添加元素
        System.out.println(link);

        //2.获取元素
        Object obj=link.peek();//获取集合的第一个元素
        System.out.println(obj);

        //3.删除元素
        link.removeFirst();//删除第一个元素
        link.pollLast();//删除集合的最后一个元素
        System.out.println(link);




    }
}
