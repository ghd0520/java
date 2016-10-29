package kr.hs.dgsw.oca.testcheck;

public class QuizGrader {

	public static void main(String[] args) {
		
		int i=1;
		System.out.println("Question  Submitted Ans.  Correct Ans.   Result");
		for(String c : args){
			System.out.printf("    %d         %s               %s");
		}
		
	}

}
