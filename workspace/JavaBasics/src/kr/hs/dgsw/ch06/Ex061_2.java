package kr.hs.dgsw.ch06;

public class Ex061_2 {

	public static void main(String[] args) {
		
		absolute(10,5);

	}

	static void absolute(int m, int n){
		if(m>n){
			System.out.println(m-n);
		}
		else{
			System.out.println(n-m);
		}
	}
}
