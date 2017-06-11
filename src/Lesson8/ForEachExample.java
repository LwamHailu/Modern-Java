package Lesson8;
import java.util.Arrays;
import java.util.List;
public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		
	//list.stream().map(m->m.toUpperCase()).forEach(m->System.out.println(m));
		
		list.stream().map(String::toUpperCase).forEach(System.out::print);
	}
	
	//implement a Consumer
	
	}