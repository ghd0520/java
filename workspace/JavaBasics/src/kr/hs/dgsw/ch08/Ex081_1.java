package kr.hs.dgsw.ch08;

import kr.hs.dgsw.ch08.buyer.*;
import kr.hs.dgsw.ch08.seller.*;

public class Ex081_1 {

	public static void main(String[] args) {
		
		FruitSeller seller1 = new FruitSeller();
		FruitSeller seller2 = new FruitSeller();
		FruitBuyer buyer1 = new FruitBuyer(10000);
		
		buyer1.buyApple(seller1, 3500);
		buyer1.buyApple(seller2, 2400);
		
		buyer1.showBuyer();
		seller1.showSaleResult();
		seller2.showSaleResult();

	}

}
