package chapter09;

public class Example9_5 {

	public static void main(String[] args) {

		String str1 = "ABCD";
		String str2 = "XYZ";

		if(str1.compareTo(str2) < 0) {
			System.out.println("str1のほうが小さい");
		}else if (str1.compareTo(str2) > 0) {
			System.out.println("str1のほうが大きい");
		}else {
			System.out.println("等しい");
		}
	}

}
