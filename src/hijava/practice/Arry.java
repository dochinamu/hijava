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
			people[i] = new Man("��" + (i+1) + "��");
		}
//		for each ��: people 9���� �ϳ��� man�� ����
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
//			i�� 0~99�̹Ƿ�, 1�� ���� ���� �ֱ�
		}
		printArray(nums);
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
//	�޼ҵ� �������̵�: �Ȱ��� �޼ҵ��ε�, Ÿ�Ը� �޶����� �ٸ� �޼ҵ�� �νĵ�
	private static void printArray(String[] strs) {
		for (int i = 0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
