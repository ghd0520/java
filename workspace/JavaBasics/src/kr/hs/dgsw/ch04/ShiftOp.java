package kr.hs.dgsw.ch04;

public class ShiftOp {

	public static void main(String[] args) {
		
		int n = 1;
		
		System.out.println(n);
		
		for(int i = 0; i < 31; i++){
			System.out.println(n<<i);
		}
		
		int m = 1024;
		m >>>= 1;
		System.out.println(m); //512
		
		m = -1024;
		m >>>= 1;
		System.out.println(m); //???
							   //쉬프트에 따른 빈공간을 0으로 채움
							   //->음수에서 양수로 변환
	}

}
