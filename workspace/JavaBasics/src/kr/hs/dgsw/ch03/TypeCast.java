package kr.hs.dgsw.ch03;

public class TypeCast {

	public static void main(String[] args) {
		
		/*
		 * ����ȯ
		 * 1. ������(�ڵ�) ����ȯ
		 * 2. ����� ����ȯ
		 */
		
		int inum;
		short snum = 120;
		inum = snum;
		
//		snum = inum; //ERROR
		snum = (short)inum; //���������ȯ
							//�����Ϸ���, ���� �Ͼ�
							//���� å������ (...?)
		
		/*
		 * �ڵ� ����ȯ ��Ģ : ǥ�������� ����
		 * byte(char) -> short -> int -> long ->
		 * float -> double
		 */
	}

}
