package kr.hs.dgsw.ch03;

public class TypeCast {

	public static void main(String[] args) {
		
		/*
		 * 형변환
		 * 1. 묵시적(자동) 형변환
		 * 2. 명시적 형변환
		 */
		
		int inum;
		short snum = 120;
		inum = snum;
		
//		snum = inum; //ERROR
		snum = (short)inum; //명시적형변환
							//컴파일러야, 나를 믿어
							//내가 책임질께 (...?)
		
		/*
		 * 자동 형변환 규칙 : 표현범위가 기준
		 * byte(char) -> short -> int -> long ->
		 * float -> double
		 */
	}

}
