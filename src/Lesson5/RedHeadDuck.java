package Lesson5;

public class RedHeadDuck extends Duck {

	@Override
	public void display() {
		this.setFlyBehavior( new FlyWithwings());
		this.setQuackbehavior(new Quack());
		super.getFlyBehaviour().fly();
		super.getQuackBehaviour().quack();
		//super.swim();
	}

	@Override
	void setFlyBehavior(FlyBehaviour f) {
		super.setFlyBehaviour(f);
		
	}

	@Override
	void setQuackbehavior(Quackbehavior q) {
		super.setQuackBehaviour(q);
		
	}

}
