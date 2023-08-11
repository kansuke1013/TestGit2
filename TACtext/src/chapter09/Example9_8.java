package chapter09;

public class Example9_8 {

	public static void main(String[] args) {

		StringBuilder message =
				new StringBuilder("that's one small step for man.");
		System.out.println(message);

		message.setCharAt(0, 'T');
		System.out.println(message);

		int pos = message.indexOf("small");
		System.out.println(pos);
		System.out.println(message.charAt(17));
		message.append(777);
		System.out.println(message);

	}

}
