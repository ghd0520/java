package kr.hs.dgsw.ch12;

import java.io.*;
import java.util.Scanner;

public class PastReadInt {

	public static void main(String[] args) {
		
		try{
			//Exception�� throw�ϴ� �޼��� ȣ���� ��
			//�ݵ�� try - catch������ ���Ѵ�
			
			/*InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("���� �Է�: ");
			String str = br.readLine();
			int num = Integer.parseInt(str);
			System.out.println("�Էµ� ����: " + num);*/
			
		}catch(Exception ex){
			
			ex.printStackTrace();
			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int num = sc.nextInt();
		System.out.println("�Էµ� ����: " + num);
		sc.close();
	}

}
