package indi.zsr.test.six;

import java.util.TreeSet;
/**
 * Comparable 接口 类内部比较器
 * */
class Teacher implements Comparable{
    String name ;
    int age;

    public  Teacher(String name,int age){
        this.name=name;
        this.age = age;

    }
    public String toString(){
        return name+":"+age;
    }
    //重写Comparable接口的compareTo方法
    @Override
    public int compareTo(Object o) {
        Teacher s =(Teacher)o;
        //定义比较方式
        if(this.age-s.age>0){
            return 1;

        }
        if(this.age -s.age==0){
            return this.name.compareTo(s.name);
        }
        return -1;
    }

}

public class Example12 {
    public static void main(String[] args) {
        TreeSet treeSet =new TreeSet();
        treeSet.add(new Teacher("Jack",12));
        treeSet.add(new Teacher("Jack",12));
        treeSet.add(new Teacher("sss",10));
        treeSet.add(new Teacher("aaa",13));
        treeSet.add(new Teacher("Jack",11));
        treeSet.add(new Teacher("fff",9));
        treeSet.add(new Teacher("sf",11));
        System.out.println(treeSet);
    }
}
