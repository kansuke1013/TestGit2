package chapter08;

public class Example8_7 {

	public static void main(String[] args) {

		ItemCase ic = new ItemCase(new Item(1, 100), new Item(2, 200));
		ic.show();
		System.out.println("Item1 : number = " + ic.it1.number);

	}

}
