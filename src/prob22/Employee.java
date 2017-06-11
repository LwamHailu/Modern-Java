package prob22;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account>accounts;

	public Employee(String name){
		this.name=name;
		accounts=new ArrayList<>();
	}

	public void addAccount(Account o){
		accounts.add(o);
	}
	public String getName() {
		return name;
	}

	

	public double computeUpdatedBalanceSum() {
		double sum=0.0;//implement
		for(Account o:accounts){
			sum+=o.computeUpdatedBalance();
		}
		return sum;
	}
	}