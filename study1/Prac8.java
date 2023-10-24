package study1;

import java.util.Scanner;

public class Prac8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자 5개를 입력하세요");
		for(int i = 0; i < 5; i++) {
			sum += scan.nextInt();
		}
		System.out.print("평균은: " + (double)sum/5);
		
		scan.close();
		
	}

}
