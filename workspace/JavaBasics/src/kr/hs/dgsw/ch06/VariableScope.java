package kr.hs.dgsw.ch06;

public class VariableScope {
		
	int mInt;
	float mFloat;
	boolean mBool;
	A mA;//�ν��Ͻ�(��ü)���(����)
	
	static int sInt;//Ŭ�������(����)
	
	public static void main(String[] args) {
		
		int a;//��������
		
		//�ν��Ͻ� ��� �ʵ�� Ŭ���� ��� �ʵ�� �ڵ� �ʱ�ȭ
		VariableScope vs = new VariableScope();
		System.out.println("�ν��Ͻ� ��� �ʵ�");
		System.out.println(vs.mInt);
		System.out.println(vs.mFloat);
		System.out.println(vs.mBool);
		System.out.println(vs.mA);
		System.out.println("Ŭ���� ��� �ʵ�");
		System.out.println(sInt);
		System.out.println("��������");
//		System.out.println(a);//���������� �ݵ�� �ʱ�ȭ �ؾ���
		
		A mA = new A();
		System.out.println(mA);

	}

}
class A{
	
}
