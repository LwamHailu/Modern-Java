package Lesson4;

public class Salaried extends Employee {
private double salary;

Salaried(int empId,double salary){
	super(empId);
	this.salary=salary;
}
	public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
	@Override
	public double calcGrossPay(int month,int year) {
		
		return getSalary();
	}
	

}