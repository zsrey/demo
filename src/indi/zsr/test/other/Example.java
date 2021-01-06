package indi.zsr.test.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/***
 * 英语题目打乱输出
 */
public class Example {
    public static void main(String[] args) {
        test();//联系
        test1();//组句
    }
    public static void test(){
        System.out.println("-----连线------");
        String[] strArrLeft = {"I’m Paul and","Speak to","Something’s gone wrong"
                ,"What’s happened","There’s a problem with","Do you","How was","I’ll put you through"};
        String[] strArrRight = {"this is John","you later","with the reservation","to our order"
                ,"the delivery","like Italian food","your flight","to Jasmine Goodman"};
        ArrayList<String> strArrLeftList = new ArrayList<>();
        ArrayList<String> strArrReghtList = new ArrayList<>();
        for (String str: strArrLeft) {
            strArrLeftList.add(str);
        }
        for (String str: strArrRight) {
            strArrReghtList.add(str);
        }
        Collections.shuffle(strArrLeftList); //随机打乱
        Collections.shuffle(strArrReghtList); //随机打乱
        int i = 1;  //序号
        int j = 65; //ASCLL对应 A
        int k = 0;  //下标
        for (String str : strArrLeftList) {
            System.out.print(i++ +"." + str +"         ");
            for (k = k; k < strArrReghtList.size();){
                for (j = j; j <= 72;) {  //ASCLL码对应 A - H
                    char c = (char)j; //将ASCLL码转成字母
                    System.out.print(c + "." + strArrReghtList.get(k));
                    k++;
                    j++;
                    break; //跳出这个内循环
                }
                break;
            }
            System.out.println();  //换行
        }


    }
    public static void test1(){
        System.out.println("------组句------");
        String[] strList = {"Would you like milk and sugar","I’m afraid Mrs White is still in a meeting",
                "Something is wrong with the package you delivered","What's happened to our delivery",
                "You sent the wrong delivery to our company","I’m Paul Rogers and this is my colleague, John Carter",
                "Mr Carter should be here soon","Would you like a cup of tea","Would you like to sit down"};
        String[] strList1 = new String[9];
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < strList.length; i++){ //打乱数组
            int rnext = (int)(Math.random() * strList.length);
            if(integers.contains(rnext)){
                i--;
                continue;
            }
            integers.add(rnext);
        }
        int k = 0;
        int j = 1;
        Iterator iterator = integers.iterator();
        while (iterator.hasNext()){  //是否有下一个可访问的数据元素
            int i = (int)iterator.next();
            strList1[i] = strList[k];
            k++;
        }
        ArrayList<String> arrStr = new ArrayList<>();
        ArrayList<String> arrStr1 = new ArrayList<>();
        for (String str : strList1){
            arrStr.add(str);
        }
        for (String str : arrStr) {
            String[] strArr = str.split(" ");   //单词通过空格拆成数组
            for (String s : strArr){
                arrStr1.add(s); //加入
            }
            Collections.shuffle(arrStr1); //打乱
            System.out.print(j++ + ".");
            for (String s1 : arrStr1){
                System.out.print(s1 + " ");
            }
            arrStr1.clear(); //清空元素
            System.out.println(); //换行
            System.out.println(); //换行
        }
    }

}
