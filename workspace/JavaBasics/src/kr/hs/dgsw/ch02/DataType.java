package kr.hs.dgsw.ch02;

public class DataType {

	public static void main(String[] args) {

		/*
		 * 자바의 데이터 유형
		 * 1. Primitive Data Type(원시자료형) : Wrapper Class
		 * boolean : Boolean
		 * char : Character
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * float : Float
		 * double : Double
		 * 2.Non-Primitive Data Type(클래스, 배열)
		 */
		
		System.out.println("byte 최소값: " + Byte.MIN_VALUE);
		System.out.println("byte 최댓값: " + Byte.MAX_VALUE);
		
		System.out.println("short 최소값: " + Short.MIN_VALUE);
		System.out.println("short 최댓값: " + Short.MAX_VALUE);
		
		System.out.println("int 최소값: " + Integer.MIN_VALUE);
		System.out.println("int 최댓값: " + Integer.MAX_VALUE);
		
		System.out.println("long 최소값: " + Long.MIN_VALUE);
		System.out.println("long 최댓값: " + Long.MAX_VALUE);
		
		System.out.println("float 최소값: " + Float.MIN_VALUE);
		System.out.println("float 최댓값: " + Float.MAX_VALUE);
		
		System.out.println("double 최소값: " + Double.MIN_VALUE);
		System.out.println("double 최댓값: " + Double.MAX_VALUE);
		
		//문자는 작은 따옴표로 표현
		//자바에서 문자는 2byte(유니코드)이다
		char ch1 = 'A';
		char ch2 = '한';
		
		boolean b1 = true;
		//boolean b1 = TRUE; //Error!(무조건 소문자)
		boolean b2 = false;
		
		System.out.println(1 > 2);
	}

}

/* 글긐긠기김깐깠
 * 긁긑긡긱깁깑깡
 * 긂긒긢긲깂깒깢
 */