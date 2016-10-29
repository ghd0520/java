package kr.hs.dgsw.ch06;

public class Method2Param {

	public static void main(String[] args) {
		
		double myHeight = 120;
		hiEveryone(1, 100);//인수를 argument라고 함

	}
	//static -> 클래스 멤버
	//메서드의 시그니쳐 -> 메서드 이름 + 매개변수 목록
	//오버로딩: 같은 이름의 함수가 여러개일때 매개변수의 갯수와 유형으로 구분짓는 것
	
	/**
	 * @param age		나이
	 * @param height	키(단위: cm)
	 * @return void
	 */
	
	public static void hiEveryone(int age, double height){//매개변수를 parameter라고 부름
		System.out.println("제 나이는 "+ age + "세 입니다.");
		System.out.println("제 키는 " + height + "cm 입니다.");
	}
	
	public static void byEveryone(){
		System.out.println("다음에 뵙겠습니다.");
	}
}


