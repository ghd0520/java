package kr.hs.dgsw.ch04;

import kr.hs.dgsw.ch03.TypeCast;

public class OperatorPriority {

	public static void main(String[] args) {
		
		/*
		 * 연산자 우선순위
		 * 1. [], .
		 * 2. expr++, expr--
		 * 3. ++expr, --expr, +expr, -expr, ~, !, (type)
		 * 4. *, /, %
		 * 5. +, -
		 * 6. <<, >>, >>>
		 * 7. <, >, >=, <=, instanceof
		 * 8. ==, !=
		 * 9. &
		 * 10. ^
		 * 11. |
		 * 12. &&
		 * 13. ||
		 * 14 ? expr : expr
		 * 15.=, +=, -=, *=, /=, &=, ^=, |=, <<=, >>=, >>>=
		 */
		
		System.out.println(5+3*2); //11
		System.out.println(1<2 == 3>4); //false
		
		TypeCast tc = new TypeCast();
		System.out.println(tc instanceof TypeCast); //true
		
	}

}
