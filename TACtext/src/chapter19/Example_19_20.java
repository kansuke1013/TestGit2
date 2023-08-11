package chapter19;

import java.util.Stack;

public class Example_19_20 {

	public static void main(String[] args) {

		Stack st = new Stack();

		st.push("abc");
		System.out.println(st.pop());
		System.out.println(st.empty());

		st.push(1);
		st.push(2);
		st.push(3);

		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
