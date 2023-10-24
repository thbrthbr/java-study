package study1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person(슈퍼 클래스) 인스턴스 생성
//		Person person = new Person("홍길동", 30);
//		System.out.println(person.toString());
//		System.out.println(person.toString("유미"));
//		
//		//Student(하위클래스) 인스턴스 생성
//		Student student = new Student("이몽룡", 32, "컴퓨터공학");
//		System.out.println(student.toString());
//		
//		//하위클래스에 부모 클래스의 메서드 사용
//		System.out.println(student.getName());
//		System.out.println(student.getAge());
//		Dog dog = new Dog("개", "바둑이", 12);
//		System.out.println("종류: " + dog.getSpecies() + ", 이름: " + dog.getName() + ", 나이: " + dog.getAge());
//		System.out.println(dog.makeSound());
//		System.out.println(dog.bark());
//		Cat cat = new Cat("고양이", "야옹이", 12);
//		System.out.println("종류: " + cat.getSpecies() + ", 이름: " + cat.getName() + ", 나이: " + cat.getAge());
//		System.out.println(cat.makeSound());
//		System.out.println(cat.cry());
		Taxi taxi = new Taxi("택시", "불법택시");
		System.out.println("차종: " + taxi.getKind() +  ", 종류: " + taxi.getName());
		System.out.println(taxi.makeSound());
	}

}
