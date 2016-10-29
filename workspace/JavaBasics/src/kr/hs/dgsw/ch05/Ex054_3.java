package kr.hs.dgsw.ch05;

public class Ex054_3 {

	public static void main(String[] args) {
		int i, sum=0;
		
		for(i=1;i<1000;i++){
			if(i%2==0&&i%7==0){
				System.out.println(i);
				sum+=i;
			}
			
		}
		System.out.println(sum);

	}

}
