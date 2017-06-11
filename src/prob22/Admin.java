package prob22;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		return list.stream().map(p->p.computeUpdatedBalanceSum()).reduce(0.0,(x,y)->x+y);
	//	double sum=0.0;
//		for(Employee o:list){
//		sum+=o.computeUpdatedBalanceSum();
//		}
//		return sum;
	}
}
