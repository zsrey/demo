package indi.zsr.test.six;

import java.util.ArrayList;

public class Example01 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        //向集合中添加元素
        list.add("stu1");
        list.add("sti2");
        list.add("stu3");
        list.add("stu3");
        System.out.println("集合的长度："+list.size());
        System.out.println("第二个元素是："+list.get(1));

    }
}
