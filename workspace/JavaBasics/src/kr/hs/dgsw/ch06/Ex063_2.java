package kr.hs.dgsw.ch06;

public class Ex063_2 {

	public static void main(String[] args) {
		
		binarys(10);

	}
	
	static void binarys(int n){
		if(n>0){
			binarys(n/2);
			System.out.println(n%2);
		}
		return;
		 
		
	}

}
