package Lesson5;

 final public class PersonAndBirthInfoImpl  implements PersonandBirthInfo{
	private Person person;
	private	BirthInfo birthInfo;
		public PersonAndBirthInfoImpl(Person person, BirthInfo birthInfo) {
			this.person = person;
			this.birthInfo = birthInfo;
		}
	@Override
	public Person getPerson() {
		
		return person;
	}

	@Override
	public BirthInfo getBirthInfo() {
				return birthInfo;
	}

}
