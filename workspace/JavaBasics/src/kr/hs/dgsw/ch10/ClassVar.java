package kr.hs.dgsw.ch10;

public class ClassVar {
	
	public static int num = 0; //클래스 변수

	public static void main(String[] args) {
		
		ClassVar cv = new ClassVar();
		System.out.println(cv.num);		  //객체 생성 후
		System.out.println(num);		  //클래스 안
		System.out.println(ClassVar.num); //클래스 안, 밖
		
	}

}
