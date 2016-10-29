package kr.hs.dgsw.ch04;

public class Ex041_2 {

	public static void main(String[] args) {
		
		//SCE.java
		int num1 = 0, num2 = 0;
		boolean result;
		
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
		
		result = (num1+=10)>0 || (num2+=10)>0;
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+num2);
		/*
		 * &&을 &으로
		 * ||을 |으로 바꾸면 된다
		 */

	}

}
