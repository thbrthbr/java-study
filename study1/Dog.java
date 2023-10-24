package study1;

public class Dog extends Animal {

	public Dog (String species, String name, int age) {
		super(species, name, age);
	}
	
	@Override
	public String makeSound() {
		return "멍멍이라고 이 " + super.makeSound();
	}
	
	public String bark() {
		return "월월월월월월";
	}
}
