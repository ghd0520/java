package kr.hs.dgsw.ch04;

public class ArithOp {

	public static void main(String[] args) {
		
		int n1 = 7;
		int n2 = 3;
		int result = n1 + n2;
		System.out.println(result); // 10
		System.out.println(n1 - n2); // 4
		System.out.println(n1 * n2); // 21
		System.out.println(n1 / n2); // 2
		System.out.println(n1 % n2); // 1
		System.out.println((float)n1/n2); // 2.333333...
		System.out.println((float)(n1/n2)); // 2.0
		
		float f1 = 1.3F;
		float f2 = 0.3F;
		System.out.println(f1%f2); //의미없다
		
		System.out.println(f1*n2); // 3.9

	}

}
