package Lesson4;

import java.time.LocalDate;

public class Test {
	
	
	public static void main(String[] args){
	Employee emp[] ={ new Hourly(12, 30, 20.00),
			new Salaried(23, 50000.00),new  Commissioned(1,23.09,45.98)};
	Commissioned c=new Commissioned(2,34.0,41.76);
	Order order =new Order(LocalDate.now(),123,c);
	c.getOrder();
	c.print(3, 1990);
	for(Employee e:emp){
		e.print(12, 1988);
	} 
	
	}		

}
