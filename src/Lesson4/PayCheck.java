package Lesson4;

public class PayCheck {
	private double grossPay;
	private final double fica= 0.23;
	private final double state=0.05;
	private final double local=0.01;
	private final double medicare=0.03;
	private final double socialSecurity=0.075;
		
	PayCheck(double grossPay){
		this.grossPay=grossPay;
		
	}
	
	
	public double getGrossPay() {
		return grossPay;
	}
	 
	public double getFica() {
		return fica;
	}
	 
	public double getState() {
		return state;
	}
 
	public double getLocal() {
		return local;
	}
 
	public double getMedicare() {
		return medicare;
	}
	 
	public double getSocialSecurity() {
		return socialSecurity;
	}
	 
public void print(){
	System.out.println(getNetPay()+" "+getGrossPay());
}
public double getNetPay(){
	return grossPay - grossPay*(fica + state+local+medicare +socialSecurity);
}
}
