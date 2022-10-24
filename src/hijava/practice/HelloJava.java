package hijava.practice;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bin 에는 실행파일
		// ctrl d : 한줄 삭제 / ctrl shift f: 코드 정리 / ctrh shift l: 단축키 정리
		/**
		 * @update 
		 * @author user
		 */
		//명사형 특징: property / 동사형 method(funciton)-무엇을?을 받기 위한 괄호를 가짐		
		//void 자리는 리턴타입
		//자바는 인터프리터가 한 줄씩 해석함(세미콜론 자리까지)
		// 메모리 속 - jvm 속 - hellojava
		HelloJava.say("Hi~"); //jvm이 실행되고 hellojava 실행됨
	}
	
	public static void say(String msg) {
		System.out.println(msg);
	}
}
