package kr.hs.dgsw.ch04;

public class Ex042_3 {

	public static void main(String[] args) {
		int i = 2147483647;
		System.out.println(i<<1);
		//오버플로우
		i=-2147483648;
		System.out.println(i<<1);
		//언더플로우

	}

}
