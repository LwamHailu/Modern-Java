package Lesson11;


import java.util.Arrays;
import java.util.List;

import Lesson3.Main;

public class SecondSmalles {
	public static <T extends Comparable< ?super  T> >  T secondSmallest(List<T>list){
		T min1=list.get(0);
		T min2=list.get(0);
		for(int i=0;i<list.size();i++){
			if(list.get(i).compareTo(min1)<0){
			    min2=min1;
				min1=list.get(i);
			  }
		else if(list.get(i).compareTo(min2)<0){
			min2=list.get(i);}
		}
		return min2;
		}
	

	public static void main(String[] args) {
		List<Integer>lis=Arrays.asList(1,2,3,5,4);
   System.out.println(secondSmallest(lis));;
	}
 
}
