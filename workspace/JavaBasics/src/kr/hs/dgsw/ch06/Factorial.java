package kr.hs.dgsw.ch06;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("3! = "+factorial(1));
		System.out.println("10! = "+factorial(10));

	}
	
	//��� �޼���
	//���������� ���
	//���谡 �ʿ� -> ��ȭ�� -> ��ʺ��� ���� �ʿ�
	//��͸޼���� ȣ��Ǵ� ������ �������� ���ϰ��� ��ȯ = ���� ���� ȣ���� ���� ������ ���� ����
	public static int factorial(int n){
		
		if(n==1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
}
	
