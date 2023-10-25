package study1;

interface Constants {
	
	// final 키워드
	// 클래스에서 사용 : 상속될 수 없다 = extends로 쓰이는 클래스가 될 수 없다/ final class MyClass{}
	// 메소드에서 사용 : 오버라이드 될 수 없다
	// 변수에서 사용 : 값 변경이 불가능 하다
	// 매개변수에서 사용 : 매개변수 값 변경 불가능 / void func(final int x) {}
	public final int MAX_VALUE = 100;
	// public final이 생략되었음
	double PI = 3.14;
}

class ConstantsEx implements Constants {
	void display() {
		System.out.println("Max Value : " + MAX_VALUE);
		System.out.println("PI : " + PI);
	}
}

public class InterfaceExample3 {
	public static void main(String[] args) {
		ConstantsEx obj = new ConstantsEx();
		obj.display();
	}
}
