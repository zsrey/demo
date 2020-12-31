package indi.zsr.test.six;

import java.util.ArrayList;
import java.util.Collections;

public class Example25 {
    public static void main(String[] args) {
        /**
         * 添加、排序操作
         * */
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"C","D","E","F");//添加元素
        System.out.println("排序前："+list);

        Collections.reverse(list);//反转集合
        System.out.println("反转后："+list);

        Collections.sort(list);         //自然排序
        System.out.println("自然排后:"+list);

        Collections.shuffle(list);      //随机排序后
        System.out.println("随机排序后："+list);

        Collections.swap(list,0,list.size()-1);//将集合的首位元素进行交换
        System.out.println("首位交换后的集合："+list);

    }
}
