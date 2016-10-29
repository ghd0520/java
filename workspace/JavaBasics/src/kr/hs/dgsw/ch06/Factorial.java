package kr.hs.dgsw.ch06;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("3! = "+factorial(1));
		System.out.println("10! = "+factorial(10));

	}
	
	//재귀 메서드
	//종료조건을 명시
	//설계가 필요 -> 점화식 -> 사례별로 정리 필요
	//재귀메서드는 호출되는 순서에 역순으로 리턴값을 반환 = 가장 먼저 호출한 것의 리턴이 가장 나중
	public static int factorial(int n){
		
		if(n==1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
}
	
