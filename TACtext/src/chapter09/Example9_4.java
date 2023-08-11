package chapter09;

public class Example9_4 {

	public static void main(String[] args) {

		String str1 = "ABC";
		String str2 = "XYZ";

		boolean flg1 = str1.equals(str2);
		boolean flg2 = str1.equals("ABC");

		System.out.println(flg1);
		System.out.println(flg2);

	}

}
