package kr.hs.dgsw.ch04;

public class Ex041_4 {

	public static void main(String[] args) {
		
		int num;
		
		for(int i=1;i<4;i++){
			num=0;
			for(int j=0;j<i+1;j++){
				num+=3*(j+1);
			}
			System.out.println(num);
		}

	}

}
