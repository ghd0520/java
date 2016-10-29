package kr.hs.dgsw.ch03;

public class Literals {

	public static void main(String[] args) {
		
		/*
		 * 리터럴
		 * Integer			2000	0	-7
		 * Floating-point	3.14	-3.14	.5	0.5
		 * Character		'A'		'한'	
		 * Boolean			true	false	TRUE(X)	FALSE(X)	True(X)	False(X)
		 * String			"a"		"\nㅋㅋㅋ"
		 */
		
		System.out.println(8); //8
		System.out.println(0b1000); //8(이진수)
		System.out.println(010); //8(팔진수)
//		System.out.println(018); //ERROR
		System.out.println(0x8); //8(십육진수)
		
		//Long
		System.out.println(100L); //100l<-소문자 가능
								  //100L 권장, 헷갈리니까.
		
		//Floating-point
		System.out.println(0.49);	//double
		System.out.println(0.49D);	//double
		System.out.println(0.49d);	//double
		System.out.println(.49d);	//double
		
		System.out.println(0.49F);	//float
		System.out.println(0.49f);	//float
		System.out.println(.49F);	//float
		
		//숫자 표현의 '_'
		System.out.println(2016);
		System.out.println(2_0_1_6);
		System.out.println(100_000_000);
//		System.out.println(_100_000_000); //ERROR
		
		//Boolean
		System.out.println(true);
		System.out.println(false);
//		System.out.println(False); //ERROR
		
		//Character: 유니코드(2byte)
		System.out.println('한');
		System.out.println('\u0041');	//A
		
		
	}

}
