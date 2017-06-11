package Lesson92;


import java.util.stream.Stream;

public class Square {
public static void main(String args[]){
	printSquares(4);
}
public static void printSquares(int num){
	Stream.iterate(1, f->f+1).map(m->m*m).map(l->l +" ").limit(num).forEach(System.out::print);
}

}
