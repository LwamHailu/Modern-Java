package Lesson92;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Union {
	public static Set<String> union(List<Set<String>> sets){
//		return sets.stream().reduce(
//				Collections.emptySet(),
//				(s1, s2) -> Stream.concat(s1.stream(), s2.stream()).collect(
//						Collectors.toSet()));
//		
		
  Optional<Set<String>>res= sets.stream().
		reduce((x,y)->
		Stream.concat(x.stream().filter(o->o.length()==1), y.stream()).collect(Collectors.toSet()));
   
		return res.get();
	}
	public static void main(String[] args) {
		List<Set<String>> sets = Arrays.asList(
				new HashSet<String>(Arrays.asList(new String[] { "A", "B" })),
				new HashSet<String>(Arrays.asList(new String[] { "D" })),
				new HashSet<String>(Arrays.asList(new String[] { "1", "3", "5" })));
		
		System.out.println(Union.union(sets));

	}
}
