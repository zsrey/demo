package indi.zsr.test.six;

import java.util.HashSet;

/**当set集合中存入对象时，可以重写Object类的hashCode()和equals()方法
 * 将字符串存入HashSet时。String 类默认重写了HashCode()和equals()方法
 */
class Student{
    String id;
    String name;
    public Student (String id,String name ){
        this.id=id;
        this.name =name;
    }
    public  String toString (){
        return id+":"+name;
    }
    //在Student中重写HashCode()和equals()方法
    public int hashCode(){
        return id.hashCode();
    }
    public boolean equals(Object obj){
        if(this==obj){          //判断是否同一个对象
            return true;        //如果是，直接返回true
        }
        if(!(obj instanceof  Student)){     //判断对象是否Student类型
            return false;
        }
        Student stu =(Student)obj;          //将对象强制转为Student类型
        boolean b= this.id.equals(stu.id);  //判断ID是否相同
        return b;
    }
}
public class Example10 {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add(new Student("1","Rose"));
        set.add(new Student("1","Rose"));
        set.add(new Student("2","Jere"));
        System.out.println(set);
    }
}
