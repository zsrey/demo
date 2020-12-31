package indi.zsr.test.other;

public class day07 {
    public static void main(String[] args) {
        //1.使用冒泡排序法
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        for (int item: arr) {
            System.out.print(item+",");
        }
        //数组长度为8  int =0;i<7;i++
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        System.out.println();
        for (int item: arr) {
            System.out.print(item +",");
        }
    }
}
