package kr.hs.dgsw.ch09;
/*
 * Ŭ������ ����
 *[���� ������] class [Ŭ���� �̸�] {
 *  	[�ν��Ͻ� ��� �ʵ��]
 *  	[Ŭ���� ��� �ʵ��]
 *  	[���� �޼���]
 *  	[������]
 *  	[�ν��Ͻ� ��� �޼����]
 * 		[Ŭ���� ��� �޼����]
 * 		[���� Ŭ������]
 * }
 */
public class FruitSeller {
	
	private final int APPLE_PRICE; //�ν��Ͻ� ��� ���, �����ڿ��� �ʱ�ȭ ����
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
		//���� ����� ����, �Ǹż��� ���
		System.out.println("���� ����� ����: "+numOfApple);
		System.out.println("�Ǹ� ����: "+myMoney);
	}

	public static void main(String[] args) {
		
		FruitSeller seller = new FruitSeller();
		seller.saleApple(2000);
		seller.showSaleResult();
	}

}
