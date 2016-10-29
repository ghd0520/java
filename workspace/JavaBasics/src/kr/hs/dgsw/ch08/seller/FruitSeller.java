package kr.hs.dgsw.ch08.seller;

public class FruitSeller {

	final int APPLE_PRICE; //인스턴스 멤버 상수, 생성자에서 초기화 가능
	int numOfApple = 20;
	int myMoney = 0;
	
	public FruitSeller(int price, int numOfApple, int myMoney){
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		this.APPLE_PRICE = price;
	}
	
	public FruitSeller(){
		APPLE_PRICE = 1000;
		numOfApple = 20;
		myMoney = 0;
	}
	
	public int saleApple(int money){
		int num = money / APPLE_PRICE;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	
	public void showSaleResult(){
		//남은 사과의 갯수, 판매수익 출력
		System.out.println("남은 사과의 갯수: "+numOfApple);
		System.out.println("판매 수익: "+myMoney);
	}
	
}
