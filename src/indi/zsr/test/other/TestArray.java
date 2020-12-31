package indi.zsr.test.other;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestArray {
	public static void main(String[] args) {
		int [] a =new int[10];

		Point [] points=new Point[3];
		//静态初始化
		points[0]=new Point();
		points[1]=new Point(1,8);
		points[2]=new Point(1,2);
		//System.out.println(points[2].chief());
		//复制数组
		Point[] points2=Arrays.copyOf(points, 5);
		points2[3]=new Point(1,5);
		points2[4]=new Point(1,4);

		//System.out.println(points2[2].chief());

		//二维数组
		int [][] b=new int[2][3];
//		int c[2][3]; //编译不通过

		//随机生成20个100以内的整数，将他们存到一维数组A中

		int [] A=new int[20];
		for (int i=0;i<A.length;i++) {
			A[i]=new Random().nextInt(100);
		}
		for (int i : A) {
			System.out.print(i+" ");
		}
		//将数组A中的后10个数复制到数组B中，并将数组B中的数据进行升序排序
		//java.lang.System类提供了一个很有用的静态方法arraycopy()用来复制数组。
		int[] B=new int[10];
		System.arraycopy(A, 0, B, 0, 10);
		Arrays.sort(B);
		System.out.println("");
		System.out.println("排序后的数组B：");
		for (int i : B) {
			System.out.print(i+" ");
		}

		//////////////////////
		System.out.println("请输入一个要查找的");
		Scanner scanner=new Scanner(System.in);
		int str=scanner.nextInt();//从键盘获取一个整数
		int num = Arrays.binarySearch(B, str);
		System.out.println();
		System.out.println(str+"在数组中的下标为"+num);
	}
}

//直角坐标系点
class Point{
	private int x;
	private int y;
	public Point() {
		// TODO Auto-generated constructor stub
		x=0;
		y=0;
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double chief() {
		return Math.sqrt(x*x +y*y);
	}

}