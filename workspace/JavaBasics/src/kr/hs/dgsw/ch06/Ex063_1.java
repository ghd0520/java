package kr.hs.dgsw.ch06;

public class Ex063_1 {

	public static void main(String[] args) {

		System.out.println(simsim(3));

	}
	
	static int simsim(int n){
		if(n==1){
			return 2;
		}
		return 2*simsim(n-1);
	}

}
