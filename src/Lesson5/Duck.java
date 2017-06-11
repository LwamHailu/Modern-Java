package Lesson5;

public abstract class Duck {
	private FlyBehaviour flyBehaviour;
	private Quackbehavior quackBehaviour;
	abstract void  display();
	abstract void setFlyBehavior(FlyBehaviour f);
	abstract void setQuackbehavior(Quackbehavior q);
	public Quackbehavior getQuackBehaviour() {
		return quackBehaviour;
	}
	public void setQuackBehaviour(Quackbehavior quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
		
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
//	public void  quack(){
//		
//	} 
	public void swim(){
		System.out.println("swimm");
	}
	
	
}
