package indi.zsr.test.six;

import java.util.ArrayList;
import java.util.Collections;

public class Example26 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        Collections.addAll(list,-3,2,4,5,6);
        System.out.println("集合中的元素"+list);
        
        System.out.println("集合中的最大元素"+Collections.max(list));       //集合中最大的元素
        System.out.println("集合中最小的元素："+Collections.min(list));      //集合中最小的元素
        Collections.replaceAll(list,6,0);//将集合中的6用代替
        System.out.println("替换后的集合："+list);

        Collections.sort(list);
        System.out.println("集合排序后"+list);

        int index =Collections.binarySearch(list,5);
        System.out.println("集合通过二分查找方法查找元素所在角标为："+index);

    }
}
