package kr.hs.dgsw.ch06;

public class Ex062_1 {

	public static void main(String[] args) {

		System.out.println("�������� 5�϶� ���� ����: "+_r2(5)+ " ���� �ѷ�: "+_2r(5));

	}
	
	static double _r2(double round){
		return 3.14*round*round;
	}
	
	static double _2r(double round){
		return 2*3.14*round;
	}

}
