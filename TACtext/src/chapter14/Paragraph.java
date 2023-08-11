package chapter14;

public abstract class Paragraph {

	protected String text;

	Paragraph(String text) {
		this.text = text;
	}

	public void show() {
		showHeader();
		System.out.println(text);
		showFooter();
	}
	public abstract void showHeader();
	public abstract void showFooter();
}
