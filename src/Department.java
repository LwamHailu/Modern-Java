import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private double location;
	List<Position>list=new ArrayList<>();
	public Department(String name, double location) {
		super();
		this.name = name;
		this.location = location;
	}
	public void print(){
		
	}
	public double getSalary(){
		 double salary=0.0;
		 for(Position o:list){
				salary+=o.getSalary();
			}
			return salary;
	}
}
