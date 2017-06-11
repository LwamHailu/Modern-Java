package Lesson5;

final public class Rectangle  implements IcomputeArea{
	private  final double width;
	private  final double length;
	Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double computeArea(){
		return 2*getLength()*getWidth(); 
	}
}
