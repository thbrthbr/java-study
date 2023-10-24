package study1;

import java.util.Scanner;

public class Prac5 {
	public double add(double a, double b) {
		return a + b;
	}
	public double sub(double a, double b) {
		return a - b;
	}
	public double mul(double a, double b) {
		return a * b;
	}
	public double div(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prac5 calc = new Prac5();
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 두 개를 입력하세요");
		double num1 = scanner.nextInt();
		double num2 = scanner.nextInt();
		System.out.println("덧셈 결과: " + calc.add(num1, num2));
		System.out.println("뺄셈 결과: " + calc.sub(num1, num2));
		System.out.println("곱셈 결과: " + calc.mul(num1, num2));
		System.out.println("나눗셈 결과: " + calc.div(num1, num2));
		scanner.close();
	}

}
