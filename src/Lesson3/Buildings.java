package Lesson3;
import java.util.ArrayList;
import java.util.List;

 public class Buildings {
private int buildingNum;
private double mainCost;
private List<Appartment>lis;

Buildings(int buildingNum,double mainCost){
	lis=new ArrayList<Appartment>();
	this.buildingNum=buildingNum;
	this.mainCost=mainCost;
}
public void addApartment(Appartment a){
	lis.add(a);
}
public double getCost(){
	double cost =0;
	for(Appartment e:lis){
		 cost=cost+e.getRent()-mainCost;
	}
	return cost;
}
@Override
public String toString() {
	return "Buildings [buildingNum=" + buildingNum + ", mainCost=" + mainCost + ", lis=" + lis + "]";
}
}
