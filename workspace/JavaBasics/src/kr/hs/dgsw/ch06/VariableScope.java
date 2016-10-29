package kr.hs.dgsw.ch06;

public class VariableScope {
		
	int mInt;
	float mFloat;
	boolean mBool;
	A mA;//인스턴스(객체)멤버(변수)
	
	static int sInt;//클래스멤버(변수)
	
	public static void main(String[] args) {
		
		int a;//지역변수
		
		//인스턴스 멤버 필드와 클래스 멤버 필드는 자동 초기화
		VariableScope vs = new VariableScope();
		System.out.println("인스턴스 멤버 필드");
		System.out.println(vs.mInt);
		System.out.println(vs.mFloat);
		System.out.println(vs.mBool);
		System.out.println(vs.mA);
		System.out.println("클래스 멤버 필드");
		System.out.println(sInt);
		System.out.println("지역변수");
//		System.out.println(a);//지역변수는 반드시 초기화 해야함
		
		A mA = new A();
		System.out.println(mA);

	}

}
class A{
	
}
