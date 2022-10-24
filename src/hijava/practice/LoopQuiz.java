package hijava.practice;

public class LoopQuiz {
	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		while (num <= 100) {
			if (num % 2 == 0) {
				num++;
				continue;
			}
			sum += num;
			num++;
		}
		
		
		System.out.println("È¦¼ö ÇÕ°è: "+ sum);
	}
}
