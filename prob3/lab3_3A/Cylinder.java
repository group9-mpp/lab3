package lab3_3A;

public class Cylinder {
 private double height;
 private double radius;
 
 public Cylinder(double radius, double height) {
	 this.radius = radius;
	 this.height = height;
 }
 
 public double getHeight() {
	 return height;
 }
 
 public double getRadius() {
	 return radius;
 }
 
 public double computeVolume() {
	 return Math.PI * Math.pow(radius, 2)  * height;
 }
}
