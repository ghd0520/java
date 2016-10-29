package kr.hs.dgsw.ch04;

public class Ex041_1 {

	public static void main(String[] args) {
		
		int num1=10, num2=20, num3=30;
		num1=num2=num3;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		/*
		 * 대입(=)연산자는 뒤의 정보를 앞의 변수에 저장하는 것이므로
		 * num3의 정보를 num2에 저장하고 그 후에 num2의 정보를 num1에 저장하게 되어
		 * 세 변수 모두 30이란 값을 가지게 된다
		 */
		  

	}

}
