package Lesson5;

public class DecoyDuck  extends Duck
{

	@Override
	public void display() {
		this.setFlyBehavior(new CannotFly());
		this.setQuackbehavior(new Squeak());
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
