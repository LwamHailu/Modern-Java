package Lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
	BiFunction<Double,Double,List<Double>>list=(x,y) -> {
		List<Double> li = new ArrayList<Double>();
		li.add(Math.pow(x,y));
		li.add( x * y);
		return li;
		
		};
		System.out.println(list.apply(2.0, 3.0));
	}

}
