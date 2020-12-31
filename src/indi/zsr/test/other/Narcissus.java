package indi.zsr.test.other;

/**
 * 水仙花数
 * 指的是一个3位数，他的每位的数字3次幂 之和等于他本身(例如： 1^3 + 5^3 + 3^3=153)
 * */
public class Narcissus {
    public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            //153  153/100=1  153/10%10=5  153/10=3
            int a =i/100;//百位数
            int b =i/10%10;//十位数
            int c =i%10;//个位数
            if(i==a*a*a + b*b*b + c*c*c){
                System.out.println(i);
            }
        }
    }
}
