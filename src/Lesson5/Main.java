package Lesson5;

import Lesson5.Duck;
import Lesson5.MallardDuck;

public class Main {
	public static void main(String args[]){
		Duck  ducks[]={new MallardDuck(),new DecoyDuck (),new RubberDuck(),new RedHeadDuck()};
		for(Duck k:ducks){
			System.out.println(k.getClass().getSimpleName());
			k.display();
			k.getFlyBehaviour();
			k.getQuackBehaviour();
			k.swim();
		}
	}

}
