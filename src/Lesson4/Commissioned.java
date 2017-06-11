package Lesson4;

import java.util.ArrayList;
import java.util.List;

public class Commissioned  extends Employee{
private double comission;
private double baseSalary;
private List<Order>order;

Commissioned(int empId,Double comission,double baseSalry){
	super(empId);
	order=new ArrayList<Order>();
	this.comission=comission;
	this.baseSalary=baseSalary;
}
	public double getComission() {
	return comission;
}
public void setComission(double comission) {
	this.comission = comission;
}
public double getBaseSalary() {
	return baseSalary;
}
public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}
	@Override
	double calcGrossPay(int month,int year) {
		
		return getBaseSalary()+getSumComission(getOrder());
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	public double  getSumComission(List<Order>ord){
		double sum=0;
		if(order!=null){
			for(Order e:ord){
				sum=sum+e.getOrderAmount()*getComission();
				}
			}
		return sum;
	}
}
