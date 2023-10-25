package study1;

interface Controller {
	void powerOn();
	void powerOff();
	default void display() {
		System.out.println("디스플레이가 커졌습니다");
	};
}

class TV implements Controller {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("TV POWER ON");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("TV POWER OFF");
	}
	
}

class Computer implements Controller {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("PC POWER ON");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("PC POWER OFF");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		TV tv = new TV();
		Computer pc = new Computer();
		tv.powerOn();
		tv.display();
		tv.powerOff();
		
		
		pc.powerOn();
		pc.display();
		pc.powerOff();
		
	}

}
