package kr.hs.dgsw.ch09;

import kr.hs.dgsw.ch09.aaa.AAA;

public class AccessModifier {

	/*
	 * ���� ������
	 * ������			Ŭ�������� ������Ű�� ��� �׿�
	 * private			OK		   NO		  NO   NO
	 * default			OK		   OK		  NO   NO
	 * protected		OK		   OK		  OK   NO
	 * public			OK		   OK		  OK   OK
	 */
	
	public static void main(String[] args) {
		
		AAA a = new AAA();
//		a.aaa /private(Ŭ���� ���ο����� ����==���ٺҰ�)
//		a.bbb /default(���� ��Ű�� ���α��� ����==���ٰ���)
//		a.ccc /protected(���� ��Ű�� ���ο��� ���ٰ���)
//		a.ddd /public(���� ��Ű�� ���ο��� ���� ����)
		
		
	}

}
