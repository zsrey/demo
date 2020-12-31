package indi.zsr.test.threadtest;

import java.util.concurrent.Callable;

/**
 * 创建线程的方式三：实现Callable接口。 --- JDK 5.0新增
 */
public class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
