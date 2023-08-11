package chapter13;

public class Shirt extends Cloth {

	String size = "M";

	public void show() {
		super.show();
		System.out.println("サイズは" + size);
		System.out.println("色は" + color + "で" + "サイズは" + size);
	}

}
