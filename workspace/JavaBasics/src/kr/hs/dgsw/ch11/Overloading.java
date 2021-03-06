package kr.hs.dgsw.ch11;

class Person{
	private int perID;
	private int milID;
	
	/*
	 * 생성자 오버로드
	 * 매개변수의 개수나 타입이 다른 경우
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
		System.out.println("민번: " + perID);
		if(milID != 0){
			System.out.println("군번: "+ milID);
		}
		else{
			System.out.println("군과 관계 없음");
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
