package Lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("cat");
		list.add("cow");
		list.add("doc");
		list.add("dog");
		final long count=list.stream().filter(s->s.contains("c"))
				
				.filter(s->!s.contains("d")).count();
		System.out.println(count);
		

	}

}
