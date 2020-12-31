package indi.zsr.test.six;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Parallel Stream并行流
 * */
public class Example35 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("张三","张样","汪汪","张晓梅");
        Stream<String> parallelStream =list.parallelStream();
        System.out.println(parallelStream.isParallel());

        //创建一个Stream串行流
        Stream<String> stream=Stream.of("张三","张样","汪汪","张晓梅");
        //使用BaseStream 接口的parallel()方法将串行流转换为并行流
        Stream<String>  parallel =stream.parallel();
        System.out.println(parallel.isParallel());
    }
}
