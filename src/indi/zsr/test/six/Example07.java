package indi.zsr.test.six;

import java.util.ArrayList;
import java.util.Iterator;

//JDK8根据lambda表达式特性还添加了一个forEach方法来遍历集合
public class Example07 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("data1");
        list.add("data2");
        list.add("data3");
        list.add("data4");

        System.out.println(list);
        list.forEach(obj-> System.out.println("迭代集合元素："+obj));

        //将集合转换为Iterator迭代器对象
        Iterator it =list.iterator();
        //使用JDK8增加的forEachRemaining (Consumer action)来遍历迭代器对象
        it.forEachRemaining(obj-> System.out.println("迭代器集合元素："+obj));
    }
}
