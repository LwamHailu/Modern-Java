package Lesson4;

import java.time.LocalDate;

public class Order {

private  int orderNo;
private LocalDate orderDate;
private int  OrderAmount ;
private Commissioned com;
public Commissioned getCom() {
	return com;
}

public void setCom(Commissioned com) {
	this.com = com;
}

public Order(LocalDate orderDate,int  OrderAmount,Commissioned com){
	this.orderDate=orderDate;
	this.OrderAmount=OrderAmount;
	this.com =  com;
}

public int getOrderNo() {
	return orderNo;
}
public void setOrderNo(int orderNo) {
	this.orderNo = orderNo;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public int getOrderAmount() {
	return OrderAmount;
}
public void setOrderAmount(int orderAmount) {
	OrderAmount = orderAmount;
}

}
