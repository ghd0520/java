package kr.hs.dgsw.ch07;

public class Ex071_2 {

	public static void main(String[] args) {

		Kid kid1 = new Kid(15);
		Kid kid2 = new Kid(9);
		
		kid1.printMarbles();
		kid2.printMarbles();
		
		kid1.addMarbles(kid2, 2);
		kid1.printMarbles();
		kid2.printMarbles();
		
		kid2.addMarbles(kid1, 7);
		kid1.printMarbles();
		kid2.printMarbles();

	}

}
