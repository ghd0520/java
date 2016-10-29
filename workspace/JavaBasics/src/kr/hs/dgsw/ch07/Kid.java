package kr.hs.dgsw.ch07;

public class Kid {

	int marbles;
	
	Kid(int marbles){
		this.marbles = marbles;
	}
	
	void printMarbles(){
		System.out.println(marbles);
	}
	
	void addMarbles(Kid kid, int num){
		kid.minusMarbles(num);
		marbles+=num;
	}
	
	void minusMarbles(int num){
		marbles-=num;
	}
	
}
