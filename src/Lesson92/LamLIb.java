package Lesson92;

import java.util.List;
import java.util.stream.Collectors;

public class LamLIb {
	public static final TriFunct<List<Employee>, Integer, Character, Long> COUNT_SAL_NAME =
			(list, m, ch) ->
				list.stream()
				.filter(e -> e.getSalary() > m)
				.filter(e -> e.getLastName().charAt(0) > ch)
				.count();
				
				public static final TriFunct<List<Employee>, Integer, Character, List<String>> LIST_SAL_NAME =
						(list, m, ch) ->
							list.stream()
							.filter(e -> e.getSalary() > m)
							.filter(e -> e.getFirstName().charAt(0) < ch).
							map(p->(p.getFirstName()+" "+p.getLastName()).toUpperCase())
							
							.sorted().collect(Collectors.toList());
							
}
