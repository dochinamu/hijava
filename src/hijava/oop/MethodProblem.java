package hijava.oop;

public class MethodProblem {

	public static void main(String[] args) {
		System.out.println(sum1ToN(10));
	}
	private static int sum1ToN(int num) {
		int sum = 0;
		for (int i=1; i <= num; i++) {
			sum +=i;
		}
		return sum;
	}


}
