package hijava.practice;

public class LoopQuiz2 {

	public static void main(String[] args) {
		int total = 0;
		for (int i=2; i<=100; i++) {
			boolean isPrime = true;
			for (int j=2; j<i; j++) {
				if (i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {				
				total = total + i;
				System.out.println(i + "�� �Ҽ��Դϴ�");
			}
			else
				System.out.println(i + "�� �Ҽ��� �ƴմϴ�");
		} 
		System.out.println("�հ�� " + total);
		
		
	}
	

}
