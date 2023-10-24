package study1;

import java.util.Scanner;
import java.util.ArrayList;

public class RectangleContainer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Rectangle> rect = new ArrayList<>();
		while(true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			if(num1 == 0 || num2 == 0) {
				break;
			}
			Rectangle rec = new Rectangle(num1, num2);
			rect.add(rec);
		}
		for(int i = 0; i < rect.size(); i++) {
			System.out.println("가로 길이는: " + rect.get(i).getWidth());
			System.out.println("세로 길이는: " + rect.get(i).getHeight());
			System.out.println("넓이는: " + rect.get(i).area());
			System.out.println("---------------------------------");
		}

		System.out.println("Rectangle 인스턴스의 개수는: " + Rectangle.getCount());
		scan.close();
	}

}
