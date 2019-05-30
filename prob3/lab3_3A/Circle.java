package lab3_3A;

public class Circle extends Cylinder {

	public Circle(double radius) {
		super(radius, 0);
	}

	public double computeArea() {
		return Math.PI * Math.pow(this.getRadius(), 2);
	}
}
