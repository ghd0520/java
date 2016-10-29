package kr.hs.dgsw.oca.ch01;

public class javaStructure {
	
	int var; //멤버변수
	static int svar = 1; //클래스변수
	
	public javaStructure(){
		
	}
	
	public javaStructure(int var){
		this.var = var;
	}
	
	//메서드
	public void firstMethod(int num){
		var += num;
	}

	public static void main(String[] args) {
		
		javaStructure js = new javaStructure();
		//js: 객체참조변수
		js.var = 1;
		js.firstMethod(10);
		js.svar++;
		
		javaStructure js2 = new javaStructure();
		System.out.println(js2.svar);
		
		System.out.println(js.var);
		
	}

}
