package chapter14;

public class P1 extends Paragraph {

	private String hfString;

	P1(String text, String hfString){
		super(text);
		this.hfString = hfString;
	}

	public void showHeader() {
		System.out.println(hfString);
	}

	public void showFooter() {
		System.out.println(hfString);
	}

}
