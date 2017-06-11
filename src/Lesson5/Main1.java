package Lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<IcomputeArea>list=new ArrayList<>();
		list.add(new Rectangle(6,4));
		list.add(new Triangle(3,4));
		list.add(new Circle(4));
		double sum=0;
		for(IcomputeArea l:list){
			sum=sum+l.computeArea();
			System.out.println(l.computeArea());
			
		}

System.out.println("Sum of Areas is "+sum);
	}

}
