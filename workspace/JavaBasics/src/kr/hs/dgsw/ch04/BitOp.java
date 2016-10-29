package kr.hs.dgsw.ch04;

public class BitOp {

	public static void main(String[] args) {
		
		/*
		 * 비트연산자
		 * &: AND
		 * |: OR
		 * ^: XOR
		 * ~: NOT
		 */
		
		byte n1 = 0b0001101; //13
		byte n2 = 0b0000111; //7
//		byte n3 = n1 & n2; //byte 피연산자의 비트연산 결과는 int
		System.out.println(n1&n2); //5
		System.out.println(n1|n2); //15
		System.out.println(n1^n2); //10
		System.out.println(~n1);   //-14
		
		
	}

}
