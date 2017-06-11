package Exe;

public class Rectangle1 {
	private double s;
	private double s2;
	private double s3;
	Rectangle1 (){
		
	}
	
	public double getArea1(){
		return getS()*getS2()*2;
		
	}
	public double getArea(){
		return getS()*getS3()*2;
		
	}
	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}

	public static Rectangle1 getRectangle(double s,double s2){
		return null;
	//	return (new Rectangle(getArea1));
	}
	public static void main(String[] args) {
		

	}

}
