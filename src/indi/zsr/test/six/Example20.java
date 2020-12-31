package indi.zsr.test.six;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map接口中还有一个常用的实现类TreeMap
 * 通过二叉树的原理来保证键的唯一性
 * 可以自定义Comparable比较器的方式对所有的键进行定制排序
 * */
class CustomComparator implements Comparator{

    @Override
    public int compare(Object obj1, Object obj2) {
        String key1 =(String) obj1;
        String key2 =(String) obj2;
        return  key2.compareTo(key1); //将比较之后的值返回
    }
}

public class Example20 {
    public static void main(String[] args) {
        Map map=new TreeMap(new CustomComparator());
        map.put("2","test");
        map.put("1","Rose");
        map.put("3","Lucy");
        System.out.println(map);
    }
}
