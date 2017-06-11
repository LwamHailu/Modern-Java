package Dan;

import java.util.function.BiFunction;
import java.util.function.Function;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem {
	// name and type of lambda goes here
	 public static BiFunction<Double,Double,Double>expresion =(x,y)->x * y * x + y;
	 
	
	// representing lambda as a method refrence
	 public static BiFunction<Double,Double,Double>expresion1=Problem::sum;
			 
	
	
	//representing lambda as a static nested class
	 static class bifunc implements BiFunction<Double,Double,Double >{

		@Override
		public Double apply(Double x, Double y) {
			
			return x * y * x + y;
		}
		 
	 }
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		
		System.out.println(expresion.apply(2.1, 0.35));
		System.out.println(expresion1.apply(2.1, 0.35));
		System.out.println(new bifunc().apply(2.1, 4.0));
	}
	private static double sum(double a,double b){
		return a*b*a+b;
	}
	public static void main(String[] args) {
		Problem p = new Problem();
		p.evaluator();
	}
	
	
}
