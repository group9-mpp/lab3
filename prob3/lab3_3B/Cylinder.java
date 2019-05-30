package lab3_3B;

public class Cylinder {
 private double height;
 private Circle circle;
 
 public Cylinder(double radius, double height) {
	 this.circle = new Circle(radius);
	 this.height = height;
 }
 
 public double getHeight() {
	 return height;
 }
 
 public double getRadius() {
	 return this.circle.getRadius();
 }
 
 public double computeVolume() {
	 return this.circle.computeArea()  * height;
 }
}
