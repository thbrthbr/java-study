package study1;

import java.util.Scanner;

public class Prac4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		scanner.close();
	}

}
