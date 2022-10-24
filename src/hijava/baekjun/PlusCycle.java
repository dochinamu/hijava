package hijava.baekjun;

public class PlusCycle {

	public static void main(String[] args) {
		int num = 71;
		int newNum = num;
		int cnt = 0;
		do {
			newNum = (newNum%10)*10 + ((newNum % 10) + (newNum/10))%10;
			System.out.println(newNum);
			cnt ++;
		} while (newNum != num);
		System.out.println("사이클 길이: " + cnt);
	}

}
