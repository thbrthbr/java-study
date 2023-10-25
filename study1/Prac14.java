package study1;

abstract class Students {
	private String name;
	private String school;
	private int age;
	private int id;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	// 추상 메서드
	abstract public void todo();
}

class Kim extends Students{
	
	public Kim() {
		super.setAge(10);
	}

	@Override
	public void todo() {
		System.out.println("점심은 김가네 김밥");
	}
	
}

class Baek extends Students{

	@Override
	public void todo() {
		System.out.println("점심은 백종원 피자");
	}
	
}


public class Prac14 {
	public static void main(String[] args) {
		Kim kim  = new Kim();
		Baek baek = new Baek();
		kim.todo();
		baek.todo();
		System.out.println(kim.getAge());
	}
}

//abstract class Students{
//	public String school;
//	public int age;
//	public int code;
//	
//	public Students (String school, int age, int code) {
//		this.school = school;
//		this.age = age;
//		this.code = code;
//	}
//	abstract public void todo();
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getCode() {
//		return code;
//	}
//	public void setCode(int code) {
//		this.code = code;
//	}
//}
//
//class Kim extends Students{
//	
//	public Kim(String school, int age, int code) {
//		super(school, age, code);
//	}
//	
//	@Override
//	public void todo() {
//		System.out.println("점심은 김가네 김밥");
//	}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getCode() {
//		return code;
//	}
//	public void setCode(int code) {
//		this.code = code;
//	}
//}
//
//class Baek extends Students{
//	
//	public Baek(String school, int age, int code) {
//		super(school, age, code);
//	}
//	
//	@Override
//	public void todo() {
//		System.out.println("점심은 백종원 피자");
//	}
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getCode() {
//		return code;
//	}
//	public void setCode(int code) {
//		this.code = code;
//	}
//}
//
//public class Prac14 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Baek baek = new Baek("SKY", 21, 1212221);
//		Kim kim = new Kim("SKY", 22, 1212222);
//		baek.todo();
//		kim.todo();
//	}
//
//}
