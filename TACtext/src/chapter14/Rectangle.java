package chapter14;

public class Rectangle extends Figure {

	private double x;
	private double y;

	Rectangle(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		return x * y;
	}


}
