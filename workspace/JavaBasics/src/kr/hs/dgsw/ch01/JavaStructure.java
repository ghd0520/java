package kr.hs.dgsw.ch01;

//���� �̸��� ������ public Ŭ����
//public Ŭ������ ���ϴ� �ϳ��� ���簡��

/**
 * @author hong
 * @version 0.01
 * @category ch01
 *
 */
public class JavaStructure {

	
	int count; //���(��ü)����
	static int scount=1; //Ŭ��������
	//������
	/**
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		
		int localvar = 1;
		
		System.out.println(localvar);
		System.out.println(scount);
		
		//����1-1, 2
		System.out.println("2 + 5=" + 2 + 5);
		//�ڹٿ��� ������ ���ʺ��� ����
		//1. " 2 + 5 = " + 2 => "2 + 5 = 2"
		//1. " 2 + 5 = 2" + 5 => "2 + 5 = 25"
		System.out.println("2 + 5 = " + (2 + 5));
		
		//����1-1, 3
		System.out.println("12");
		System.out.println("1" + "2");
		System.out.println("1" + 2);
		//�ڹٿ����� �ǿ����� �� ���ڿ��� ������ "+" �� ���ڿ� ���� ������ �����Ѵ�.
		System.out.println(1 + "2");
		System.out.println(12);
		
/*									   \
		/-------------------------------\
		|/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/|===========]
		\-------------------------------/			
								       /				*/
	}

}