package chapter14;

public class P2 extends Paragraph{

	P2(String text){
		super(text);
	}

	public void showHeader() {
		System.out.println("<paragraph>");
	}
	public void showFooter() {
		System.out.println("</paragraph>");
	}

}
