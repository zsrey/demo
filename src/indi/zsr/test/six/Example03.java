package indi.zsr.test.six;
//迭代器 Iterator 主要用于迭代访问（即遍历）Collection 中的元素

import java.util.ArrayList;
import java.util.Iterator;

public class Example03 {
    public static void main(String[] args) {
        //创建Arraylist集合
        ArrayList list =new ArrayList();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        //获取Iterator对象
        Iterator iterator =list.iterator();
        //判断集合中是否存在下一个元素
        while (iterator.hasNext()){
            Object object =iterator.next();//使用Arraylist集合中的元素
            System.out.println(object);
        }

    }
}
