package kr.hs.dgsw.ch08.seller;

public class FruitSeller {

	final int APPLE_PRICE; //�ν��Ͻ� ��� ���, �����ڿ��� �ʱ�ȭ ����
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
		//���� ����� ����, �Ǹż��� ���
		System.out.println("���� ����� ����: "+numOfApple);
		System.out.println("�Ǹ� ����: "+myMoney);
	}
	
}
