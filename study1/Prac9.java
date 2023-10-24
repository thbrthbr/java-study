package study1;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		String word = "";
		while(!word.equals("exit")) {
			System.out.println("문자를 입력해주세요: ");
			word = scan.next();
			if(!word.equals("exit")) {
				arr.add(word);
			}
		}
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		scan.close();
	}

}
