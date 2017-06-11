package Lesson5;

final public class Triangle implements IcomputeArea {
	private  final double  base;
	private final  double height;
Triangle(double base,double height){
	this.base=base;
	this.height=height;
}
	public double computeArea(){
		return 0.5*getBase()*getHeight();
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
}
