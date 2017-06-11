package Lesson3;

public class Appartment {
private int aptNum;
private double rent=0;
Appartment(int aptNum,double rent){
	this.aptNum=aptNum;
	this.rent=rent;
}
public int getAptNum() {
	return aptNum;
}
public double getRent() {
	return rent;
}
public void setRent(double rent) {
	this.rent=rent;
}
}
