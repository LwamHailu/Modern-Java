package Lesson5;

final public class Circle implements IcomputeArea {
	private final  double raduis;
	Circle(double raduis){
		this.raduis=raduis;
	}
	public double computeArea(){
		return Math.PI*getRaduis()*getRaduis();
	}
	public double getRaduis() {
		return raduis;
	}
}
