package kr.hs.dgsw.ch04;

public class LogicOp {
	
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		
		boolean result1 = (num1 == 11) && (num2++ == 20); //true
		System.out.println(num2);
		
		// expr1 && expr2 -> expr1�� false�̸� expr2�� ������ �ȵ�
		// expr1 & expr2 -> expr1�� false���� expr2�� ������ ��
		boolean result2 = (num1 <= 12) || (num2 >= 30); //true
		
	}

}
