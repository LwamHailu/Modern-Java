
import java.util.ArrayList;
import java.util.List;

public class Company {
private String name;
private  static List<Department>list=new ArrayList<>();
public Company(String name) {
	super();
	this.name = name;
}
public void add(Department o){
	list.add(o);
	
}
public void print(){
	
}
public static double getSalary(){
	double salary=0.0;
	 for(Department o:list){
			salary+=o.getSalary();
		}
		return salary;
}
}
