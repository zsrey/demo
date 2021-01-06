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
        test2();
    }

    public static void test() {
        System.out.println("-----连线------");
        String[] strArrLeft = {"I’m Paul and", "Speak to", "Something’s gone wrong"
                , "What’s happened", "There’s a problem with", "Do you", "How was", "I’ll put you through"};
        String[] strArrRight = {"this is John", "you later", "with the reservation", "to our order"
                , "the delivery", "like Italian food", "your flight", "to Jasmine Goodman"};
        ArrayList<String> strArrLeftList = new ArrayList<>();
        ArrayList<String> strArrReghtList = new ArrayList<>();
        for (String str : strArrLeft) {
            strArrLeftList.add(str);
        }
        for (String str : strArrRight) {
            strArrReghtList.add(str);
        }
        Collections.shuffle(strArrLeftList); //随机打乱
        Collections.shuffle(strArrReghtList); //随机打乱
        int i = 1;  //序号
        int j = 65; //ASCLL对应 A
        int k = 0;  //下标
        //"Something’s gone wrong         "  length =31
        String spaceStr="";
        for (String str : strArrLeftList) {

            System.out.print(i++ + "." + String.format("%0$-31s", str));
            for (k = k; k < strArrReghtList.size(); ) {
                for (j = j; j <= 72; ) {  //ASCLL码对应 A - H
                    char c = (char) j; //将ASCLL码转成字母
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

    public static void test1() {
        System.out.println("------组句------");
        String[] strList = {"Would you like milk and sugar", "I’m afraid Mrs White is still in a meeting",
                "Something is wrong with the package you delivered", "What's happened to our delivery",
                "You sent the wrong delivery to our company", "I’m Paul Rogers and this is my colleague, John Carter",
                "Mr Carter should be here soon", "Would you like a cup of tea", "Would you like to sit down"};

        String[] strList1 = new String[9];
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < strList.length; i++) { //打乱数组
            int rnext = (int) (Math.random() * strList.length);
            if (integers.contains(rnext)) {
                i--;
                continue;
            }
            integers.add(rnext);
        }
        int k = 0;
        int j = 1;
        Iterator iterator = integers.iterator();
        while (iterator.hasNext()) {  //是否有下一个可访问的数据元素
            int i = (int) iterator.next();
            strList1[i] = strList[k];
            k++;
        }
        ArrayList<String> arrStr = new ArrayList<>();
        ArrayList<String> arrStr1 = new ArrayList<>();
        for (String str : strList1) {
            arrStr.add(str);
        }
        for (String str : arrStr) {
            String[] strArr = str.split(" ");   //单词通过空格拆成数组
            for (String s : strArr) {
                arrStr1.add(s); //加入
            }
            Collections.shuffle(arrStr1); //打乱
            System.out.print(j++ + ".");
            for (String s1 : arrStr1) {
                System.out.print(s1 + " ");
            }
            arrStr1.clear(); //清空元素
            System.out.println(); //换行
            System.out.println(); //换行
        }
    }

    public static void test2() {
        System.out.println("                                         选词填空                                         ");
        String[] strArray = {"Can you set up a ______ in the room?  ",
                "I’m _______ there’s a problem with the flight.",
                "I _______ apologize for the delay.", "I’m moving ______ the meeting from 4 to 3.",
                "I’m putting _______ the visit from 3 to 4.", "I ______ speak to Mr Harris yesterday.He was sick.",
                "Jasmine _______ him the report last week.", "How long ______ the flight yesterday? It ______ that long.About two hours.",
                "_______ you see Diane this morning? ",
                "How long ______ you in the meeting? I think it ______ about three hours.",
                "I’m _______ Mr Carter is ______ a meeting.", "Would you ______ to ______ a seat?",
                "I’d like ______ coffee ______.", "Ms Goodman ______ be here ______.",
                "Could you ______ coffee and tea at about 4 o’clock?", "I’m so ______ you had to wait."
        };
        String[] queArray = {"projector", "afraid", "truly", "up", "back",
                "did", "didn’t", "emailed", "was", "was", "wasn’t", "were",
                "afraid", "in", "like", "have", "some", "please", "should", "soon"
                , "provide", "sorry"
        };

        ArrayList<String> strList =new ArrayList(strArray.length);
        Collections.addAll(strList,strArray);
        Collections.shuffle(strList);

        ArrayList<String> queList =new ArrayList(queArray.length);
        Collections.addAll(queList,queArray);
        Collections.shuffle(queList);


        System.out.println(" -----------------------------------------------------------------------------------------");
        System.out.println("丨                                                                                       丨");
        System.out.print("丨    ");
        Iterator iterator =queList.iterator();
        int i =0;
        while (iterator.hasNext()){
            i++;
            String s= iterator.next().toString();
            System.out.print(s+"  ");
            if(queArray.length/2==i) {
                System.out.println("        ");
                System.out.print("丨    ");
            }
        }
        System.out.print("          \n");
        System.out.println("丨                                                                                       |");
        System.out.println(" -----------------------------------------------------------------------------------------");

        System.out.println();
        iterator =strList.iterator();
        i=0;
        while (iterator.hasNext()) {
            i++;
            String s= iterator.next().toString();
            System.out.println(i+"、"+s);

        }

    }
}
