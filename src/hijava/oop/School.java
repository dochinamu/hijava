package hijava.oop;

public class School {

	public static void main(String[] args) {
		Score korean = new Score(); //생성자 안 만들었으면, 디폴트 생성자
		korean.setSubject("국어");
		korean.setScore(90);
		
		Score math = new Score("수학", 80);
		Score science = new Score("과학");
		
		System.out.println(korean);
		System.out.println(math);
		System.out.println(science);
	}

}
