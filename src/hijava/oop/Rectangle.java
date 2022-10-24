package hijava.oop;

public class Rectangle {
	private int width;
	private int length;
	private int circumference;
	
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public int getArea() {
		return width * length;
	}

	public int getCircumference() {
		return (width + length) *2;
	}
	

	public static void main(String[] args) {
		Rectangle rc = new Rectangle(6,9);
		System.out.println("가로 = 6, 세로 9일 떄");
		System.out.println("넓이: " + rc.getArea());
		System.out.println("둘레: " + rc.getCircumference());
	}

}
