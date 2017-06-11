package Lesson5;

import java.time.LocalDate;

 final public class BirthInfo {
	
	private Person person;
	private   LocalDate dateOfBirth;
	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return person;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
}
