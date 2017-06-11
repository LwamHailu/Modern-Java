package Dan;

import java.util.Comparator;

//The lambda:   (Long a, Long b) -> a.compareTo(b)
//NOTE: You may NOT type this as a BiFunction
public class PartC {
	
	//provide a functional interface type for the lambda - do NOT use BiFunction
	 public static Comparator<Long> comp=(a,b)->a.compareTo(b);
	
	//provide a method reference and the type of method reference
	//TYPE: 
	public static Comparator<Long> comp1=PartC::com;
	
 private static  int com(Long a,Long b){
		return a.compareTo(b);
	}
	
	// provide an inner class that behaves the same way as the labmda
	//class My--- implements --- { }
  static class com implements Comparator<Long>{

		@Override
		public int compare(Long o1, Long o2) {
			
			return o1.compareTo(o2);
		}
	
}
		
	
	public void evaluator() {
		System.out.println(comp.compare(12345678910L, 9182764765L));
		System.out.println(new com().compare(12345678910L, 9182764765L));
		System.out.println(comp1.compare(12345678910L, 9182764765L));
		
	}
	
	public static void main(String[] args) {
		PartC pa = new PartC();
		pa.evaluator();
	}

	
}