package Lesson3;

public class Cylinder1 {
private Circle circle;
private double height =1.0;

//Cylinder1(double r){
//	circle=new Circle(r);
//}
//Cylinder1(Circle circle){
//	this.circle=circle;
//	
//}
public double getHeight() {
	return height;
}

Cylinder1(double r,double height){
	circle=new Circle(r);
	this.height=height;
}
public double getVolume() {
	
	return circle.getArea()*this.getHeight();
}
@Override
public String toString() {
	return ""+getVolume();
}
	public static void main(String[] args) {
		//Circle c=new Circle(4);
		Cylinder1 c1=new Cylinder1(2,4);
		//System.out.println(c1.getHeight());
		
		//Cylinder1 c=new Cylinder1(c,3);
		System.out.println(c1.getVolume());
		
		//System.out.println(c.getArea());

	}
	

}
