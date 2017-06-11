package Lesson5;

final public class Person {
	private BirthInfo bI;
	private String name;
	Person( String name){
		this.name=name;
	}
	public  String getName() {
		return name;
	}
	public void setBirthInfo(BirthInfo bI) {
		this. bI =  bI;
	}
	
	public BirthInfo getbI() {
		return bI;
	}
	
	
}
