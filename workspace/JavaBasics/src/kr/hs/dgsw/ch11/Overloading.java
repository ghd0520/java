package kr.hs.dgsw.ch11;

class Person{
	private int perID;
	private int milID;
	
	/*
	 * ������ �����ε�
	 * �Ű������� ������ Ÿ���� �ٸ� ���
	 */
	
	public Person(int pID, int mID){
		perID = pID;
		milID = mID;
	}
	
	public Person(int pID){
		//perID = pID;
		//milID = 0;
		this(pID, 0);
	}
	
	public void showInfo(){
		System.out.println("�ι�: " + perID);
		if(milID != 0){
			System.out.println("����: "+ milID);
		}
		else{
			System.out.println("���� ���� ����");
		}
	}
}

public class Overloading {

	public static void main(String[] args) {
		Person man = new Person(950123, 880102);
		Person woman = new Person(888888);
		
		man.showInfo();
		woman.showInfo();
		

	}

}