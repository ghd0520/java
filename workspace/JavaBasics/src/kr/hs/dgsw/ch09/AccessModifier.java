package kr.hs.dgsw.ch09;

import kr.hs.dgsw.ch09.aaa.AAA;

public class AccessModifier {

	/*
	 * 접근 제한자
	 * 제한자			클래스내부 동일패키지 상속 그외
	 * private			OK		   NO		  NO   NO
	 * default			OK		   OK		  NO   NO
	 * protected		OK		   OK		  OK   NO
	 * public			OK		   OK		  OK   OK
	 */
	
	public static void main(String[] args) {
		
		AAA a = new AAA();
//		a.aaa /private(클래스 내부에서만 적용==접근불가)
//		a.bbb /default(동일 패키지 내부까지 적용==접근가능)
//		a.ccc /protected(동일 패키지 내부에서 접근가능)
//		a.ddd /public(동일 패키지 내부에서 접근 가능)
		
		
	}

}
