package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private String landLordName;
	private List<Buildings>list;
	
	Landlord (String landLord){
		this.landLordName=landLord;
		this.list=new ArrayList<Buildings>();
	}
	public void addBuilding(Buildings b){
	list.add(b);
		
	}
	public double getMonthlyBenefit(){
		double totalRent=0;
		for(Buildings e:list){
			totalRent= totalRent+e.getCost();
		}
		return totalRent;
	}
	@Override
	public String toString() {
		return "Landlord [landLordName=" + landLordName + ", list=" + list + "]";
	}
	
}
