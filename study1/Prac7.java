package study1;

import java.util.Scanner;
import java.util.Arrays;


public class Prac7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		
//		int[] intArray = {1,2,3,4,5};
//		
//		for(int i = 0; i < intArray.length; i++) {
//			System.out.print(intArray[i] + " ");
//		}
		int[] intArray = new int[5]; // 크기가 5인 int 배열
		
		System.out.println("숫자 5개를 입력하세요");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
		}
		// Array.toString 배열의 요소를 문자열로 반환
		System.out.print(Arrays.toString(intArray));
		
		scan.close();
	}

}
