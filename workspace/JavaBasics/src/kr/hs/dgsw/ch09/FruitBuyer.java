package kr.hs.dgsw.ch09;

public class FruitBuyer {
		
	int myMoney;
	int numOfApple;
		
	public FruitBuyer(){
		myMoney=10000;
		numOfApple=0;
	}

	public void buyApple(FruitSeller seller, int money){
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyer(){
		System.out.println("���� �ܾ�: "+myMoney);
		System.out.println("��� ����: "+numOfApple);
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
