package kr.hs.dgsw.oca.ch01;

public class javaStructure {
	
	int var; //�������
	static int svar = 1; //Ŭ��������
	
	public javaStructure(){
		
	}
	
	public javaStructure(int var){
		this.var = var;
	}
	
	//�޼���
	public void firstMethod(int num){
		var += num;
	}

	public static void main(String[] args) {
		
		javaStructure js = new javaStructure();
		//js: ��ü��������
		js.var = 1;
		js.firstMethod(10);
		js.svar++;
		
		javaStructure js2 = new javaStructure();
		System.out.println(js2.svar);
		
		System.out.println(js.var);
		
	}

}
