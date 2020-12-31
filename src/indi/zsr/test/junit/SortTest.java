package indi.zsr.test.junit;

import org.junit.Test;

import java.io.BufferedReader;

public class SortTest {
    int a[]={10,17,4,3,6,12,1,8,17};
    int n=9;

    @Test
    public void BubbleSort(){
        int temp;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                if(a[j-1]>a[j]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
            PrintArr(i);
        }
    }
    public  void PrintArr(int k){
        System.out.print(k+": ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
    }
}
