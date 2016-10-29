package kr.hs.dgsw.ch05;

public class Ex056_2 {

	public static void main(String[] args) {
		int i=1, sum=0;
		
		while(true)
		{
			if(i%2!=0){
				sum+=i;
			}
			else if(i%2==0&&i%3==0){
				sum+=i;
			}
			if(sum>1000){
				System.out.println(i);
				System.out.println(sum);
				break;
			}
			i++;
		}

	}

}
