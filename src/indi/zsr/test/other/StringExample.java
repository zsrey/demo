package indi.zsr.test.other;

public class StringExample {
	public static void main(String[] args) {
		String s1 = new String("you are s student"), s2 = new String("how are you");
		if (s1.equals(s2)) {
			System.out.println("s1��s2������ͬ");
		} else {
			System.out.println("s1��s2���ݲ���ͬ");
		}
		String s3 = new String("22030219851022024");
		if (s1.startsWith("220302")) {
			System.out.println("����ʡ�����֤");
		}
		String s4 = new String("��"), s5 = new String("��");
		if (s4.compareTo(s5) > 0) {
			System.out.println("���ֵ���s4����s5");
		} else {
			System.out.println("���ֵ���s4С��s5");
		}

		int position = 0;
		String path = "C:\\java\\jsp\\A.java";
		position = path.lastIndexOf('\\');
		System.out.println(position);

		String fileName = path.substring(position + 1);
		System.out.println(fileName);

		String s6 = new String("100");
		String s7 = new String("123.654");
		int n1 = Integer.parseInt(s6);
		double n2 = Double.parseDouble(s7);

		double n = n1 + n2;
		System.out.println(n);

		String s8 = new String("ABCDEF");
		char[] a = s8.toCharArray();
		System.out.println(a);
		for (char c : a) {
			System.out.println(c);
		}
	}
}
