package kr.hs.dgsw.ch05;

public class Ex051_2 {

	public static void main(String[] args) {
		
		int num = 120;
		
		if(num<0){
			System.out.println("0 �̸�");
		}
		else if(num<100){
			System.out.println("0 �̻� 100 �̸�");
		}
		else if(num<200){
			System.out.println("100 �̻� 200 �̸�");
		}
		else if(num<300){
			System.out.println("200 �̻� 300 �̸�");
		}
		else{
			System.out.println("300 �̻�");
		}

	}

}