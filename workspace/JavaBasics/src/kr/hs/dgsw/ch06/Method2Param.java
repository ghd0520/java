package kr.hs.dgsw.ch06;

public class Method2Param {

	public static void main(String[] args) {
		
		double myHeight = 120;
		hiEveryone(1, 100);//�μ��� argument��� ��

	}
	//static -> Ŭ���� ���
	//�޼����� �ñ״��� -> �޼��� �̸� + �Ű����� ���
	//�����ε�: ���� �̸��� �Լ��� �������϶� �Ű������� ������ �������� �������� ��
	
	/**
	 * @param age		����
	 * @param height	Ű(����: cm)
	 * @return void
	 */
	
	public static void hiEveryone(int age, double height){//�Ű������� parameter��� �θ�
		System.out.println("�� ���̴� "+ age + "�� �Դϴ�.");
		System.out.println("�� Ű�� " + height + "cm �Դϴ�.");
	}
	
	public static void byEveryone(){
		System.out.println("������ �˰ڽ��ϴ�.");
	}
}


