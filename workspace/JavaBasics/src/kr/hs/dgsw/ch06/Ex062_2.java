package kr.hs.dgsw.ch06;

public class Ex062_2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++){
			if(prime(i)==true){
				System.out.println(i);
			}
		}

	}
	
	static boolean prime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
