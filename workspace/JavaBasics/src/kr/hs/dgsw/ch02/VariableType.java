package kr.hs.dgsw.ch02;

public class VariableType {
	
	//��ü ����
	//Ŭ�����κ��� ��ü�� ������ ��(�ν��Ͻ� ȭ) �޸𸮿� �������
	//��ü�� �޸𸮿� �����ϴ� ���� ����� �� ����
	int objVar;
	
	//Ŭ���� ����
	
	//���α׷��� ����� �� ����
	//��ü ������ ������, Ŭ���� �̸����� ����
	static int clsVar=0;
	
	//������
	//��ü ������ �ʱ�ȭ
	public VariableType(int objVar){
		this.objVar = objVar;
	}

	public static void main(String[] args) {
		
		//���� ����
		//�޼��尡 ����Ǵ� ���ȸ� �޸𸮿� ����
		int locVar = 5;
		
		
		VariableType vt = new VariableType(10);
		//vt: ��ü ���� ����, ��ü ���� ���� ����
		System.out.println(vt.objVar);
		System.out.println(locVar);
		System.out.println(VariableType.clsVar);
		System.out.println(clsVar);
		System.out.println(vt.clsVar);
		
	}

}

//supercalifragilisticexpialidocious
