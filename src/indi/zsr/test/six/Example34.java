package indi.zsr.test.six;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example34 {
    public static void main(String[] args) {
        Stream<String> stream =Stream.of("是否","是不sss","第三方","方法");
        //stream.forEach(i-> System.out.println(i));
        //流只能运行（调用中间或终端流操作）一次。
        //如果流实现可能会丢失IllegalStateException，如果它检测到该流被重用。+

        //2.过滤
        stream.filter(i->i.startsWith("是"))
        .filter(i->i.length()>2)
                .forEach(System.out::println);
        //3.映射
        //Stream流对象的map()方法可以将流对象的元素通过特定的规则进行改造然后映射为另一个流对象
        Stream<String> stream1 =Stream.of("a1","a2","a3","c2","c1");
        stream1.filter(i->i.startsWith("c"))    //筛选出以c开头的元素
                .map(String::toUpperCase)       //对流元素进行映射，将全部字符改为大写
                .sorted()                       //对流元素进行排序
        .forEach(System.out::println);

        //4.截取
        //通过字符串源数据创建一个Stream对象
        Stream<String> stream2 =Stream.of("张三","李四","汪汪","张晓梅");
        stream2.skip(1)     //跳过流中的前一个元素
                .limit(2)   //截取流中的前两个元素
                .forEach(System.out::println);

        //5.收集
        //forEach无法将进行中间操作后的流元素作为我们熟悉的对象或者数据类型进行保存
        //collect()方法使用Collector作为参数，Collector包含了四种不同的操作:
        //supplier（初始构造器）、accumulator(累加器)、combiner(组合器)、finisher(终结者)

        Stream<String> stream3 =Stream.of("张三","李四","汪汪","张晓梅");
        List<String> list=stream3.filter(i->i.startsWith("张"))
                .collect(Collectors.toList());
        //通过collect方法进行终结操作，将流元素放进i一个list
        System.out.println(list);

        Stream<String> stream4=Stream.of("张三","张样","汪汪","张晓梅");
        String string =stream4.filter(i->i.startsWith("张")).collect(Collectors.joining("and"));

        System.out.println(string);
    }
}
