package kr.hs.dgsw.ch07;

public class FruitMarket {

	public static void main(String[] args) {
		
		FruitSeller seller1 = new FruitSeller();
		FruitSeller seller2 = new FruitSeller();
		FruitBuyer buyer1 = new FruitBuyer();
		
		buyer1.buyApple(seller1, 3500);
		buyer1.buyApple(seller2, 2400);
		
		buyer1.showBuyer();
		seller1.showSaleResult();
		seller2.showSaleResult();
		

	}

}
