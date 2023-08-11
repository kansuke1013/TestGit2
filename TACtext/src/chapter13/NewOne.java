package chapter13;

public class NewOne extends Original {

	public String size;

	public NewOne(String color, String size) {
		super(color);
		this.size = size;
	}

	public void showSize() {
		System.out.println("サイズは" + size);
	}
}
