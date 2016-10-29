package kr.hs.dgsw.ch12;

import java.io.*;
import java.util.Scanner;

public class PastReadInt {

	public static void main(String[] args) {
		
		try{
			//Exception을 throw하는 메서드 호출할 때
			//반드시 try - catch문으로 감싼다
			
			/*InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("정수 입력: ");
			String str = br.readLine();
			int num = Integer.parseInt(str);
			System.out.println("입력된 정수: " + num);*/
			
		}catch(Exception ex){
			
			ex.printStackTrace();
			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		System.out.println("입력된 정수: " + num);
		sc.close();
	}

}
