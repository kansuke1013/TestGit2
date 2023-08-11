package chapter14;

public class Example_14_2 {

	public static void main(String[] args) {

		Paragraph[] p = new Paragraph[2];
		p[0] = new P1("this is text1.", "#############");
		p[1] = new P2("this is text2.");

		for(int i = 0; i < p.length; i++) {
			p[i].show();
		}

	}

}
