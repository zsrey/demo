package indi.zsr.test.six;

import java.util.ArrayList;

public class Example23 {
    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        list.add("String");
        list.add("collection");
        list.add(1);
        for (Object obj :
                list) {
            String str =(String) obj;//会引发ClassCastException异常，
            //Java语言规范定义了允许的转换，其中大多数可在编译时进行验证。
            // 不过，某些转换还需要运行时验证。如果在此运行时验证过程中检测到不兼容，JVM就会引发ClassCastException异常
            System.out.println(str);
        }
    }
}
