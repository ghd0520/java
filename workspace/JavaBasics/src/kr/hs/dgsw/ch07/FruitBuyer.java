package kr.hs.dgsw.ch07;

public class FruitBuyer {
		
	int myMoney;
	int numOfApple;
		
	public FruitBuyer(){
		myMoney=5000;
		numOfApple=0;
	}

	public void buyApple(FruitSeller seller, int money){
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyer(){
		System.out.println("ÇöÀç ÀÜ¾×: "+myMoney);
		System.out.println("»ç°ú °¹¼ö: "+numOfApple);
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
