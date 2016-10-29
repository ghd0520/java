package kr.hs.dgsw.ch04;

public class BitOp {

	public static void main(String[] args) {
		
		/*
		 * ��Ʈ������
		 * &: AND
		 * |: OR
		 * ^: XOR
		 * ~: NOT
		 */
		
		byte n1 = 0b0001101; //13
		byte n2 = 0b0000111; //7
//		byte n3 = n1 & n2; //byte �ǿ������� ��Ʈ���� ����� int
		System.out.println(n1&n2); //5
		System.out.println(n1|n2); //15
		System.out.println(n1^n2); //10
		System.out.println(~n1);   //-14
		
		
	}

}
