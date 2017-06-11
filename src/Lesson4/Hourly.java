package Lesson4;

public class Hourly extends Employee {
private double hourlyWage;
private double hoursperWeek;
Hourly(int empId,double hourlyWage,double hoursperWeek){
	super(empId);
	this.hourlyWage=hourlyWage;
	this.hoursperWeek=hoursperWeek;
}
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public double getHoursperWeek() {
		return hoursperWeek;
	}
	public void setHoursperWeek(double hoursperWeek) {
		this.hoursperWeek = hoursperWeek;
	}
	@Override
	double calcGrossPay(int month,int year) {
		return getHourlyWage()*getHoursperWeek()*4;
	}

}
