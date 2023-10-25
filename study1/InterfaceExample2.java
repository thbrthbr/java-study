package study1;

interface Move {
	void moveForward();
	void moveBackward();
}
interface Power {
	void powerOn();
	void powerOFf();
}

interface Cars extends Move, Power {
	void changeGear(int gear);
}


class Suv implements Cars {

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveBackward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOFf() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeGear(int gear) {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suv mySuv = new Suv();
		mySuv.powerOn();
		mySuv.changeGear(5);
		mySuv.moveForward();
	}

}
