package kr.hs.dgsw.ch08;

public class circleTest {

	public static void main(String[] args) {
		
		kr.hs.dgsw.ch08.area.Circle c1 = new kr.hs.dgsw.ch08.area.Circle(1.5);
		kr.hs.dgsw.ch08.perimeter.Circle c2 = new kr.hs.dgsw.ch08.perimeter.Circle(2.5);
		System.out.println("������ 1.5�� ���� ����: " + c1.getArea());
		System.out.println("������ 2.5�� ���� ����: " + c2.getPerimeter());

	}

}
