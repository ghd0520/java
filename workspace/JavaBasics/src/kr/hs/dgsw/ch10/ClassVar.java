package kr.hs.dgsw.ch10;

public class ClassVar {
	
	public static int num = 0; //Ŭ���� ����

	public static void main(String[] args) {
		
		ClassVar cv = new ClassVar();
		System.out.println(cv.num);		  //��ü ���� ��
		System.out.println(num);		  //Ŭ���� ��
		System.out.println(ClassVar.num); //Ŭ���� ��, ��
		
	}

}
