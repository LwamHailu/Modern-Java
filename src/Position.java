import java.util.ArrayList;
import java.util.List;

public class Position {
	private Employee e;
	private String title;
	private String description;

public Position(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		
		
}
public void addEmp(Employee e){
	this.e=e;
}

public void print(){
	
}
public double getSalary(){
	
	
	return e.getSalary();
}
}
