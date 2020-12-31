package indi.zsr.test.other;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/***/
public class StreamExample {
    /**
     * 流的创建*/
    List<String> list = Arrays.asList("a","b","c");
    //创建一个顺序流
    Stream<String> stream =list.stream();
    //创建一个并行流
    Stream<String> parallelStream = list.parallelStream();

    int[] array ={1,3,5,6,8};
    IntStream intStream=Arrays.stream(array);

    Stream<Integer> stream1 =Stream.of(1,2,3,4,5,6);
    Stream<Integer> stream2 =Stream.iterate(0,(x)->x+3).limit(4);
    Stream<Double> stream3 =Stream.generate(Math::random).limit(3);


}
