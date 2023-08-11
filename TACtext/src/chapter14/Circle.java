package chapter14;

public class Circle extends Figure {

	private double r;

	Circle(double r){
		this.r = r;
	}

	public double getArea() {
		return r * r * 3.14;
	}

}
