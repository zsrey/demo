package indi.zsr.test.junit;

import org.junit.Test;

/*
 * java中的JUnit单元测试
 *
 * 步骤：
 *  1.选中当前工程 - 右键选择： build path - configure build path -  libraries - add library
 * - Junit 4 - 下一步 （Eclipse）
 *  1.  File-->settings-->Plguins-->Browse repositories-->输入JUnit-->选择JUnit Generator V2.0安装。
 * 2.创建Java类要求： 此类是puplic  此类提供公共的无参构造器
 * 3.此类中声明单元测试类
 * 此时的单元测试方法：方法的权限是puplic ，没有返回值，没有形参
 *
 * 4.此单元测试方法上需要声明注解： @Test，并在单元测试类中导入：org.junit.Test
 *
 * 说明：
 * 1.如果执行结果没有任何异常。绿条
 * 2.如果执行结果出现异常红条
 *
 * 快捷键 alt+insert
 * **/

public class JUnitTest {
    int num=10;
    @Test
    public void testEquals(){
        String s1 ="MM";
        String s2 ="MM";
        System.out.println(s1.equals(s2));
        String s3="How was                 ";
        System.out.println(s3.length());

    }
    public void show(){
        System.out.println(num);
    }
}
