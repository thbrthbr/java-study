package study1;

import java.util.Scanner;

public class Prac6 {
	
	public double circle(int a) {
		return a * a * Math.PI;
	}
	public int triangle (int a, int b) {
		return a * b / 2;
	}
	public int square (int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Prac6 calc = new Prac6();
		
		System.out.println("원의 반지름을 입력하세요");
		int num1 = scanner.nextInt();
		System.out.println("반지름이 " + num1 + "인 원의 넓이: " + calc.circle(num1));
		System.out.println("직사각형의 가로와 세로의 길이를 입력하세요");
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		System.out.println("가로 " + num2+ " 세로 " + num3 +"인 직사각형의 넓이: " + calc.square(num2, num3));
		System.out.println("직각삼각형의 밑변과 높이의 길이를 입력하세요");
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		System.out.println("밑변 " + num4+ " 높이 " + num5 +"인 직각삼각형의 넓이: " + calc.triangle(num2, num3));
		scanner.close();
	}

}
