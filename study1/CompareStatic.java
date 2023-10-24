package study1;

// static이 없는 경우
class WithoutStatic {
	private int registered = 0;
	private String name;
	
	public WithoutStatic(String name) {
		this.name = name;
		registered++;
	}
	
	public int getRegistered() {
		return registered;
	}
}

//static 변수가 있는 경우
class WithStatic {
	// static을 집어넣으면 인스턴스끼리 공유하는 변수가 된다
	// 객체를 생성하지 않아도 static이 붙은 거엔 접근가능
	// static 메소드에서 non-static 멤버에 접근할 수 없음
	// static 메소드에서 this키워드 사용불가
	private static int registered = 0;
	private String name;
	
	public WithStatic(String name) {
		this.name = name;
		registered++;
	}
	public int getRegistered() {
		return registered;
	}
}

// static 메소드
class MathUtil{
	private static double PI = 3.14;
	
	// 메소드
	public static double circle(double radius) {
		return radius * radius * PI;
	}
}

public class CompareStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(MathUtil.circle(3.3));


		
		//static이 없는 경우
		WithoutStatic a = new WithoutStatic("홍길동");
		WithoutStatic b = new WithoutStatic("이몽룡");
		System.out.println("Without Static");
		System.out.println("홍길동: " + a.getRegistered());
		System.out.println("이몽룡: " + b.getRegistered());
		
		WithStatic c = new WithStatic("성춘향");	
		WithStatic d = new WithStatic("임꺽정");
		System.out.println("With Static");
		System.out.println("성춘향: " + c.getRegistered());
		System.out.println("임꺽정: " + d.getRegistered());
	}

}
