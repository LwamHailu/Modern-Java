package Lesson4;

public abstract class Employee {
private int empId;
private PayCheck payCheck;


Employee (int empId){
	this.empId=empId;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public void print(int month,int year){
	System.out.println(getEmpId()+""+calcCompensation( month, year).getNetPay()+""+calcGrossPay(month,year));
}
public PayCheck calcCompensation(int month,int year){
	return new PayCheck(calcGrossPay(month, year));
}
abstract double calcGrossPay(int month,int year);
}  
