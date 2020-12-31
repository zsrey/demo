package indi.zsr.test.six;

import java.util.ArrayList;
import java.util.Iterator;

public class Example06 {
    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        list.add("data4");

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Object obj =iterator.next();
            if("data2".equals(obj)){
                list.remove(obj);   //删除集合会导致迭代器预期的迭代次数发生改变，导致迭代器的结果不准确，触发异常。
                break;              //跳出循环不报错
            }
        }

        System.out.println(list);
    }
}
