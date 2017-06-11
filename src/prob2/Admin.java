package prob2;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double totalCom=0.0;
		for(Employee o:list){
			totalCom+=o.computeUpdatedBalanceSum();
		}
		return totalCom;
	}
}
