package chapter19;

public class Example19_4 {

	public static void main(String[] args) {

		double r = 5.0;
		double a = 5.78;

		double s = 4.0 * Math.PI * Math.pow(r, 2.0);
		double y = Math.pow(r, 2.0);
		double v = 4.0 / 3.0 * Math.PI * Math.pow(r, 3.0);

		double c = Math.ceil(a);
		double d = Math.floor(a);
		double e = Math.round(a);
		double f = Math.random();

		System.out.println("半径" + r + "の球の");
		System.out.println("表面積は" + s);
		System.out.println("体積は" + v + "です");

		System.out.println(y);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

}
