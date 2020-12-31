package indi.zsr.test.junit;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

/**
 * 字符测试类
 */
public class StringTest {
    @Test
    public void test1(){
        Scanner scanner =new Scanner(System.in);
        String input=scanner.nextLine();
        char[] arr=input.toLowerCase().toCharArray();
        Map<Character,Integer> map= new TreeMap();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' ') continue;
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        double size=map.size();
        map.values().stream().map(x->(double)x/map.size());
        Iterator iterator =map.values().iterator();
        while (iterator.hasNext()){
            int o=(Integer) (iterator.next());
            double d= o/size;
            if(d>0.5){
                System.out.println("yes");
                break;
            }
            else if(!iterator.hasNext()){
                System.out.println("no");
            }
        }
        System.out.println(map);


    }
}
