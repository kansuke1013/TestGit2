package chapter09;

public class Example_9_6 {

	public static void main(String[] args) {

		String numbers = "1230,450,380";
		int start = 0;
		int end;

		do {
			end = numbers.indexOf(',', start);
			if (end != -1) {
				System.out.println(numbers.substring(start, end));
				start = end + 1;
			}
		} while (end != -1);

		System.out.println(numbers.substring(start));

	}

}
