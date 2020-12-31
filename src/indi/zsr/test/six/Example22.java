package indi.zsr.test.six;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Properties集合
 * */
public class Example22 {
    public static void main(String[] args) throws Exception {
        //1.通过Properties 进行属性文件读取操作
        Properties pps =new Properties();
        //加载要读取的文件test.properties
        pps.load(new FileInputStream("test.properties"));
        //遍历test.properties 键值对元素信息
        pps.forEach((k,v)-> System.out.println(k+""+v));

        //2.通过Properties进行属性文件写入操作
        FileOutputStream out =new FileOutputStream("test.properties");
        //向文件写入键值对信息
        pps.setProperty("charset","UTF-8");
        pps.store(out,"新增charset编码");

    }
}
