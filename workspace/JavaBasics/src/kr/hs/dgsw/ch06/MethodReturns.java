package kr.hs.dgsw.ch06;

public class MethodReturns {

	public static void main(String[] args) {
		
		int res = adder(4, 5);
		System.out.println(res);

	}
	
	public static int adder(int num1, int num2){
		return num1 + num2;
	}

}
