package chapter10;

public class Person {

	private static int count;
	private static double weightTotal;
	private static double heightTotal;

	private double weight;
	private double height;

	public Person(double weight, double height) {
		this.weight = weight;
		this.height = height;
		weightTotal += weight;
		heightTotal += height;
		count++;
	}

	public void show() {
		System.out.println("体重: " + weight + "身長: " + height);
	}

	public static void showHeightAvg() {
		System.out.println("平均身長: " + heightTotal / count);
	}
}
