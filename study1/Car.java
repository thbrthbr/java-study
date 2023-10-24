package study1;

public class Car {
	
	// 접근제어자
	// public : 같은 클래스o, 같은 패키지o, 자식클래스o, 전체o
	// protected : 같은 클래스o, 같은 패키지o, 자식클래스o, 전체x
	// default : 같은 클래스o, 같은 패키지o, 자식클래스x, 전체x
	// private : 같은 클래스o, 같은 패키지x, 자식클래스x, 전체x

	// 멤버 변수
	private int speed;
	
	// 생성자
	// 클래스명과 동일해야함
	public Car(int speed) {
		this.speed = speed;
	}
	
	public void start() {
		System.out.println("Car Start");		
	}
	
	public void increaseSpeed(int speed) {
		this.speed = this.speed + speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0) {
			this.speed = speed;
		}
	}
	
	
	
	// setter 메소드
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	
//	// getter 메소드
//	public int getSpeed() {
//		return this.speed;
//	}

}
