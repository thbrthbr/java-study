package study1;

public class Vehicle {

	private String kind;
	private String name;
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Vehicle (String kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	
	public String makeSound() {
		return "차는 소리를 낸다";
	}
	
}
