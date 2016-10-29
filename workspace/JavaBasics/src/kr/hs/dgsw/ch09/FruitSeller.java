package kr.hs.dgsw.ch09;
/*
 * 클래스의 구조
 *[접근 제한자] class [클래스 이름] {
 *  	[인스턴스 멤버 필드들]
 *  	[클래스 멤버 필드들]
 *  	[메인 메서드]
 *  	[생성자]
 *  	[인스턴스 멤버 메서드들]
 * 		[클래스 멤버 메서드들]
 * 		[내부 클래스들]
 * }
 */
public class FruitSeller {
	
	private final int APPLE_PRICE; //인스턴스 멤버 상수, 생성자에서 초기화 가능
	private int numOfApple = 20;
	private int myMoney = 0;
	
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

	public static void main(String[] args) {
		
		FruitSeller seller = new FruitSeller();
		seller.saleApple(2000);
		seller.showSaleResult();
	}

}
