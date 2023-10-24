package study1;

public class Person extends Object{
	private String name;
	private int age;
	
	// 생성자
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
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
	
	// 오버라이딩
	@Override //  오버라이드 했을 때 관습상 달아준다
	public String toString() {
		return "Person / name : " + name + ", age : " + age;
	}
	
	// 이건 오버로딩
	public String toString(String a) {
		return a;
	}
	
	
}
