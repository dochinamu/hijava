package hijava.oop;

public class School {

	public static void main(String[] args) {
		Score korean = new Score(); //������ �� ���������, ����Ʈ ������
		korean.setSubject("����");
		korean.setScore(90);
		
		Score math = new Score("����", 80);
		Score science = new Score("����");
		
		System.out.println(korean);
		System.out.println(math);
		System.out.println(science);
	}

}
