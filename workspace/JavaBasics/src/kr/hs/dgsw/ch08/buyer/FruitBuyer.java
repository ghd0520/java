package kr.hs.dgsw.ch08.buyer;

import kr.hs.dgsw.ch08.seller.*;

public class FruitBuyer {

	int myMoney;
	int numOfApple;
		
	public FruitBuyer(int i){
		myMoney=i;
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
	
}
