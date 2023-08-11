package chapter10;

public class Car {

	public static int count;
	private String number;

	public Car(String number) {
		this.number = number;
		count++;
		System.out.println("ナンバー" + number + "の新車を作りました。");
	}
}
