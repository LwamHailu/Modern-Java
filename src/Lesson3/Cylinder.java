package Lesson3;

public class Cylinder extends Circle{
	private double height =1.0;
Cylinder(){
	
}
Cylinder(double radius){
	super(radius);
}
Cylinder(double radius,double height){
	super(radius);
	this.height=height;
}
public double getHeight() {
	return height;
}
public double getVolume() {
	double base= super.getArea();
	return base*height;
}
@Override
public String toString() {
	return ""+getVolume();
}
}
