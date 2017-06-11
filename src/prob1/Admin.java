package prob1;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		return list.stream().filter(p->p.getGpa()>3).filter(p->p.getMajor()==Majors.CS).
				collect(Collectors.toList());
	}
}
