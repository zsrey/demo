package indi.zsr.test.six;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Comparator是外部比较器
 * 比较接口，我们如果需要控制某个类的次序，而该类本身不支持排序(即没有实现Comparable接口)，那么我们就可以建立一个“该类的比较器”来进行排序
 * */
class MyComparator implements Comparator {
    //重写排序方法
    @Override
    public int compare(Object obj1, Object obj2) {//定制排序方法
        String s1 =(String) obj1;
        String s2 =(String) obj2;
        int temp =s1.length() - s2.length();
        return temp;
    }


}

public class Example13 {
    public static void main(String[] args) {
        TreeSet ts =new TreeSet(new MyComparator());
        ts.add("Jack");
        ts.add("Helena");
        ts.add("Eva");
        System.out.println(ts);

        //创建集合时，使用lambda表达式定制排序规则
        TreeSet ts2=new TreeSet((obj1,obj2)->{
            String s1 =(String) obj1;
            String s2=(String) obj2;
            return s1.length() - s2.length();
        });
        ts2.add("Jack");
        ts2.add("Helena");
        ts2.add("Eva");
        System.out.println(ts2);
    }
}
