package study1;

abstract class Animals{
	abstract public void sleep();
}

class Chicken extends Animals{
	@Override
	public void sleep() {
		System.out.println("꼬꼬댁");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		
		// 추상클래스는 인스턴스화 할 수 없음
//		Animals animal = new Animals();
		Chicken chicken = new Chicken();
//		chicken.sound();
		chicken.sleep();

	}
	

}
