package indi.zsr.test.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(7);
        Collections.sort(list);
        for (Integer data : list) {
            System.out.print(data);
        }
        //比较器的重写 sort默认升序，重写后为降序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                if(t1 < t2 ){
                    return 1;
                }else{
                    return  -1;
                }
            }
        });
        System.out.println();
        for (Integer data:list) {
            System.out.print(data);
        }
    }
}
