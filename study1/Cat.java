package study1;

public class Cat extends Animal {

	public Cat (String species, String name, int age) {
		super(species, name, age);
	}
	
	@Override
	public String makeSound() {
		return "야옹이라고 이 " + super.makeSound();
	}
	
	public String cry() {
		return "냥냥냥냥냥냥";
	}
}
