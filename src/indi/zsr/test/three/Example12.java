package indi.zsr.test.three;

class Student{
	static String schoolName;
}
public class Example12 {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		
		Student.schoolName="桂林电子科技大学";
		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);
	}
}
