package kr.hs.dgsw.ch02;

public class DataType {

	public static void main(String[] args) {

		/*
		 * �ڹ��� ������ ����
		 * 1. Primitive Data Type(�����ڷ���) : Wrapper Class
		 * boolean : Boolean
		 * char : Character
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * float : Float
		 * double : Double
		 * 2.Non-Primitive Data Type(Ŭ����, �迭)
		 */
		
		System.out.println("byte �ּҰ�: " + Byte.MIN_VALUE);
		System.out.println("byte �ִ�: " + Byte.MAX_VALUE);
		
		System.out.println("short �ּҰ�: " + Short.MIN_VALUE);
		System.out.println("short �ִ�: " + Short.MAX_VALUE);
		
		System.out.println("int �ּҰ�: " + Integer.MIN_VALUE);
		System.out.println("int �ִ�: " + Integer.MAX_VALUE);
		
		System.out.println("long �ּҰ�: " + Long.MIN_VALUE);
		System.out.println("long �ִ�: " + Long.MAX_VALUE);
		
		System.out.println("float �ּҰ�: " + Float.MIN_VALUE);
		System.out.println("float �ִ�: " + Float.MAX_VALUE);
		
		System.out.println("double �ּҰ�: " + Double.MIN_VALUE);
		System.out.println("double �ִ�: " + Double.MAX_VALUE);
		
		//���ڴ� ���� ����ǥ�� ǥ��
		//�ڹٿ��� ���ڴ� 2byte(�����ڵ�)�̴�
		char ch1 = 'A';
		char ch2 = '��';
		
		boolean b1 = true;
		//boolean b1 = TRUE; //Error!(������ �ҹ���)
		boolean b2 = false;
		
		System.out.println(1 > 2);
	}

}

/* �ۃO�d�����
 * �܃P�e��郋��
 * �E�Q�f�t������
 */