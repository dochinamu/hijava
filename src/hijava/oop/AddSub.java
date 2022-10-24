package hijava.oop;

public class AddSub {
	int a;
	
	AddSub() {
		this.a = 0;
	}
	
	public int add(int b) {
		return this.a += b;
	}
	
	public int sub(int b) {
		return this.a -= b;
	}
	
	boolean isOdd(int num) {
		return num % 2 == 1;
	}

	public static void main(String[] args) {
		AddSub cal = new AddSub();
		System.out.println(cal.add(1));
		System.out.println(cal.sub(1));
		System.out.println(cal.add(3));
		System.out.println(cal.isOdd(3));
	}

}
