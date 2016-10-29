package kr.hs.dgsw.ch01;

//파일 이름과 동일한 public 클래스
//public 클래스는 파일당 하나만 존재가능

/**
 * @author hong
 * @version 0.01
 * @category ch01
 *
 */
public class JavaStructure {

	
	int count; //멤버(객체)변수
	static int scount=1; //클래스변수
	//진입점
	/**
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		
		int localvar = 1;
		
		System.out.println(localvar);
		System.out.println(scount);
		
		//문제1-1, 2
		System.out.println("2 + 5=" + 2 + 5);
		//자바에서 연산은 왼쪽부터 수행
		//1. " 2 + 5 = " + 2 => "2 + 5 = 2"
		//1. " 2 + 5 = 2" + 5 => "2 + 5 = 25"
		System.out.println("2 + 5 = " + (2 + 5));
		
		//문제1-1, 3
		System.out.println("12");
		System.out.println("1" + "2");
		System.out.println("1" + 2);
		//자바에서는 피연산자 중 문자열이 있으면 "+" 는 문자열 결합 연산을 수행한다.
		System.out.println(1 + "2");
		System.out.println(12);
		
/*									   \
		/-------------------------------\
		|/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/|===========]
		\-------------------------------/			
								       /				*/
	}

}