package chapter14;

public class Example_14_1 {

	public static void main(String[] args) {

		Figure[] fg = new Figure[2];
		fg[0] = new Rectangle(5.0, 10.0);
		fg[1] = new Circle(5.0);

		for(int i = 0; i < fg.length; i++) {
			System.out.printf("%d番目の図形の面積 = %.2f", i, fg[i].getArea());
			System.out.println();
		}
	}

}
