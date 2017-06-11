package Lesson11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capture  {

	public static void reverse(List<?> list){
	System.out.println(helpRever(list));	
	}
	private static <T> List<T> helpRever(List<T>li){
		List<T>lis= new ArrayList<T>();
		for(int i=1;i<=li.size();i++){
			lis.add(li.get(li.size()-i));
		}
		return lis;
	}
	public static void main(String[] args) {
		List<String> list=Arrays.asList("dfd","dfdr","jiop");
		reverse(list);
    System.out.println(list.size());
     
	}

}
