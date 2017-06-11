package prob2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account>list;
	public Employee(String name) {
		list=new ArrayList<>();
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	public void addAccount(Account e) {
		list.add(e);
	}

	public double computeUpdatedBalanceSum() {
		//implement
		double com=0.0;
		for(Account o:list){
		com+=o.computeUpdatedBalance();
			
		}
		return com;
	}}