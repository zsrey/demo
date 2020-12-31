package indi.zsr.test.six;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的遍历
 * keySet()方法和entrySet()方法
 * 首先调用Map对象的KeySet()方法，获得存储Map集合中所有键的Set集合
 * 然后通过Iterator迭代Set集合的每一个键元素，最后通过get(ObjectKey)方法，获取对应的值
 * */
public class Example15 {
    public static void main(String[] args) {
        //Iterator迭代器遍历Map集合
        Map map =new HashMap<>();
        map.put("1","test");
        map.put("2","sss");
        map.put("3","aaa");
        System.out.println(map);
        //使用Iterator迭代器遍历Map集合，需要先将Map集合转换为Iterator接口对象
        Set ketSet= map.keySet();       //获取键的集合
        Iterator it =ketSet.iterator(); //迭代器的集合
        while (it.hasNext()){
            Object key =it.next();
            Object value=map.get(key);
            System.out.print(key + ":"+value+ "  ");
        }
        System.out.println();

        //首先调用Map对象的entrySet()方法获取存储Map中所有键值映射的Set集合，
        //这个集合中存放了Map、Entry类型元素（Entry是Map接口的内部类）
        //每个Map.Entry对象代表 Map中的一个键值对
        Set entrySet = map.entrySet();
        Iterator iterator=entrySet.iterator(); //获取Iterator对象
        while (iterator.hasNext()){
            Map.Entry entry =(Map.Entry) (iterator.next());
            Object key= entry.getKey();             //获取entry中的键
            Object value =entry.getValue();         //获取entry中的值
            System.out.print(key + ":"+value+ "  ");
        }

        //使用forEach
        map.forEach((key,value)-> System.out.print(key+ ":"+value+ "  "));
    }
}
