package study1;

public class Student extends Person{
	
	private String major;

	public Student(String name, int age, String major) {
		// super() : 하위 클래스에서 상위 클래스 생성자를 호출하는데 사용
		// super 키워드는 상위 클래스의 메서드를 호출하는데 사용
		super(name, age);
//		setAge(age);
//		setName(name);
		this.major = major;
	}
	
	@Override //  오버라이드 했을 때 관습상 달아준다
	public String toString() {
//		return "Student / super: " + super.toString() + ", major : " + major;
		return "Student / name : " + super.getName() + ", age: " + super.getAge() + ", major : " + major;
	}
}
