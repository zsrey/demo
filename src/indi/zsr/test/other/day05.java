package indi.zsr.test.other;
/**
 * 一个数如果恰好等于它的因子之和， 这个数就被称为"完数" 例如 6=1+2+3  28=1+2+4+7+14
 * */
public class day05 {
    public static void main(String[] args) {
        int factor = 0;
        for (int i = 1; i <= 1000; i++) {
            //i=1
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    factor +=j;
                }
            }

            if(i==factor)
                System.out.println(i);

            factor=0;
        }


    }
}
