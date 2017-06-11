package Lesson8;

import java.util.Arrays;
import java.util.List;


public class BestCount {

	final PentaFunction<List<String>, Character, Character, Integer, Integer> count
    = (list, a, b, l) -> (int) list.stream()
       .filter(word -> word.contains("" + a)&& !word.contains("" + b)&& word.length() == l).count();  


    public int countWords(List<String> words, char c, char d, int len) {
		return count.apply(words, c, d, len);
	}

    public static void main(String[] args) {
    	BestCount best = new BestCount();
		
		List<String> strings = Arrays.asList("car", "door", "card", "hello", "world", "comment", "cd", "return", "world", "cat");
		
		System.out.println(best.countWords(strings, 'c', 'd', 3));

	}

}