package Lesson92;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLiberary {
public final static QuadFuction<List<Employee>,Character,Character,Double,List<String>>FULL_NAME=

    (list, c,b,d)->list.stream().filter(p->p.getSalary()>100000).
			filter(p->p.getLastName().charAt(0)>
		'M' && p.getLastName().charAt(0)<='Z').map(p->p.firstName +" "+ p.getLastName()+",").
			sorted().collect(Collectors.toList());
	
	

}
