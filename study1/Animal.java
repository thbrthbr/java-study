package study1;

public class Animal {
	private String species;
	private String name;
	private int age;
	
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal (String species, String name, int age) {
		this.species = species;
		this.name = name;
		this.age = age;
	}
	
	public String makeSound() {
		return "동물은 소리를 낸다";
	}
}
