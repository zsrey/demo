package indi.zsr.test.six;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example14 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "test");
        map.put("2", "sss");
        map.put("3", "aaa");
        System.out.println(map);
        System.out.println(map.containsKey("1"));
        System.out.println(map.get("1"));
        //获取 集合中的键对象和值对象集合
        System.out.println(map.keySet());//以Set集合的形式返回Map集合中所有的值对象Value
        System.out.println(map.values());//以Collection集合的形式返回Map集合中所有的值对象Value
        //替换指定键值对象映射的值
        map.replace("1", "Tom");
        System.out.println(map);
        //删除指定键对象映射的键值对元素
        map.remove("1");
        System.out.println(map);


        //遍历1
        Set set = map.keySet();
        for (Object o : set) {
            Object value = map.get(o);//map可以通过key 获取value
            System.out.println(value);
        }
        //遍历2
        Set entries = map.entrySet();
        for (Object e : entries) {
            Map.Entry et = (Map.Entry) e;
            Object k = et.getKey();
            Object v = et.getValue();
        }
        //遍历3
        Set entrySet = map.entrySet();
        Iterator iterator=entrySet.iterator(); //获取Iterator对象
        while (iterator.hasNext()){
            Map.Entry entry =(Map.Entry) (iterator.next());
            Object key= entry.getKey();             //获取entry中的键
            Object value =entry.getValue();         //获取entry中的值
            System.out.print(key + ":"+value+ "  ");
        }

    }
}
