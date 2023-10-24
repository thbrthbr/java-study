package study1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Prac11 {
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("배열 크기를 입력하세요.");
			int num = scan.nextInt();
			int sum = 0;
			ArrayList<Integer> arr2 = new ArrayList<>();
			System.out.println("배열 요소들을 입력하세요.");
			while(true) {
				String input = scan.next();
				if(input.equals("stop")) {
					break;
				}
				arr2.add(Integer.parseInt(input));
			}
			for(int i = 0; i < num; i++) {
				sum += arr2.get(i);
			}
			System.out.println(sum/num);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("인덱스가 범위를 벗어났습니다");
		}
		catch(InputMismatchException e) {
			System.out.println("입력오류. 정수를 입력하세요.");
		}
		catch(NumberFormatException e ) {
			System.out.println("숫자만 입력해주세요.");
		}
		

		scan.close();
		
	}
}
