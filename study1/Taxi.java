package study1;

public class Taxi extends Vehicle {

	public Taxi (String kind, String name) {
		super(kind, name);
	}
	
	@Override
	public String makeSound() {
		return "'비키라고 씨'라고 이 " + super.makeSound();
	}

}
