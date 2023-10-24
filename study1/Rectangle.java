package study1;

public class Rectangle {

	private int height;
	private int width;
	private static int count = 0;
	
	public static int getCount() {
		return count;
	}

	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
		count++;
	}

	public int area() {
		return this.height * this.width;
	}
	
	public int getHeight () {
		return this.height;
	}
	public int getWidth () {
		return this.width;
	}


}
