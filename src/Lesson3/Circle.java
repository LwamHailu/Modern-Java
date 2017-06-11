package Lesson3;

public class Circle {
private double radius;
private String color="red";
Circle(){
	}
Circle(double radius){
	this.radius=radius;
}
@Override
public String toString() {
	return ""+getArea();
}
public double getRadius() {
	return radius;
}
public double getArea(){
	return Math.PI*radius*radius;
}
}
