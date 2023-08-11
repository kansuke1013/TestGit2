package chapter15;

public class Rectangle2 extends Figure2
implements Comparable, Scalable {

	private double x;
	private double y;

	Rectangle2(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		return x * y;
	}

	public int compareTo(Object obj) {
		Figure2 another = (Figure2)obj;
		return (int)(getArea() - another.getArea());
	}

	public void enlarge(int d) {
		x *= d;
		y *= d;
	}

	public void show() {
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("Area : " + getArea());
	}
}
