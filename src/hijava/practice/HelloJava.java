package hijava.practice;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bin ���� ��������
		// ctrl d : ���� ���� / ctrl shift f: �ڵ� ���� / ctrh shift l: ����Ű ����
		/**
		 * @update 
		 * @author user
		 */
		//����� Ư¡: property / ������ method(funciton)-������?�� �ޱ� ���� ��ȣ�� ����		
		//void �ڸ��� ����Ÿ��
		//�ڹٴ� ���������Ͱ� �� �پ� �ؼ���(�����ݷ� �ڸ�����)
		// �޸� �� - jvm �� - hellojava
		HelloJava.say("Hi~"); //jvm�� ����ǰ� hellojava �����
	}
	
	public static void say(String msg) {
		System.out.println(msg);
	}
}
