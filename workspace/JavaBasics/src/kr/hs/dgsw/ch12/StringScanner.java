package kr.hs.dgsw.ch12;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		
		try{
			String src = "1 5.5 7";
			Scanner sc = new Scanner(src);
			int num1 = sc.nextInt();
			double num2 = sc.nextDouble();
			int num3 = sc.nextInt();
			double sum = num1 + num2 + num3;
			System.out.printf("문자열에 저장된 %d, %.1f, %d의 합은 %.1f이다"
					, num1, num2, num3, sum);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}

}
