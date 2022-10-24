package hijava.practice;

public class Arry {

	public static void main(String[] args) {
//		ex1();
		ex2();
		ex3();
	}

	private static void ex3() {
		Man[] people = new Man[9];
		int len = people.length;
//		for loop
		for (int i = 0; i<len; i++) {
			people[i] = new Man("김" + (i+1) + "수");
		}
//		for each 문: people 9명을 하나씩 man에 넣음
		for (Man man: people) {
			System.out.println(man);
		}
	}

	private static void ex2() {
		String[] strs = new String[100];
		int len = strs.length;
		for (int i = 0; i<len; i++) {
			strs[i]= "str" + (i+1);
		}
		printArray(strs);
	}

	private static void ex1() {
		int [] nums = new int[100];
		
		for (int i = 0; i<nums.length; i++) {
			nums[i] = i+1; 
//			i는 0~99이므로, 1씩 더한 값을 넣기
		}
		printArray(nums);
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
//	메소드 오버라이드: 똑같은 메소드인데, 타입만 달라지니 다른 메소드로 인식됨
	private static void printArray(String[] strs) {
		for (int i = 0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
