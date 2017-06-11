import java.time.LocalDate;

public class Employee {
private String emoId;
private String firstName;
private String lastName;
private String middleName;
private LocalDate birthdate;
private String ssn;
private double salary;

public Employee(String emoId, String firstName, String lastName, String middleName, LocalDate birthdate, String ssn,
		double salary) {

	this.emoId = emoId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.middleName = middleName;
	this.birthdate = birthdate;
	this.ssn = ssn;
	this.salary = salary;
}
public void print(){
	
}
public double getSalary(){
	return salary;
}
}
