package kr.hs.dgsw.ch02;

public class VariableType {
	
	//객체 변수
	//클래스로부터 객체를 생성할 때(인스턴스 화) 메모리에 만들어짐
	//객체가 메모리에 존재하는 동안 사용할 수 있음
	int objVar;
	
	//클래스 변수
	
	//프로그램이 실행될 때 생성
	//객체 생성과 무관함, 클래스 이름으로 접근
	static int clsVar=0;
	
	//생성자
	//객체 변수를 초기화
	public VariableType(int objVar){
		this.objVar = objVar;
	}

	public static void main(String[] args) {
		
		//지역 변수
		//메서드가 실행되는 동안만 메모리에 존재
		int locVar = 5;
		
		
		VariableType vt = new VariableType(10);
		//vt: 객체 참조 변수, 객체 참조 값을 저장
		System.out.println(vt.objVar);
		System.out.println(locVar);
		System.out.println(VariableType.clsVar);
		System.out.println(clsVar);
		System.out.println(vt.clsVar);
		
	}

}

//supercalifragilisticexpialidocious
