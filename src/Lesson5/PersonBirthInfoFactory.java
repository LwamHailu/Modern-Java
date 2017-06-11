package Lesson5;

import java.time.LocalDate;

public final class PersonBirthInfoFactory {
	PersonBirthInfoFactory(){
		
	}
	public static PersonandBirthInfo createPersonAndBirthInfo(String name, LocalDate dob) {
		Person person =new Person(name);
		BirthInfo birthInfo = new BirthInfo(dob);
		birthInfo.setPerson(person);
		person.setBirthInfo(birthInfo);
		
		
		return new PersonAndBirthInfoImpl(person,birthInfo);
	}

}