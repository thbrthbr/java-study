package study1;
import java.util.Scanner;
public class Prac1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.next(); // 공백 이전까지의 문자열 읽기
		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt(); // 정수 읽기
		System.out.printf("안녕하세요! %s님(%d세)", name, age).println();
		scanner.close();
	}
}