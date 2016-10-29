package kr.hs.dgsw.ch08;

public class circleTest {

	public static void main(String[] args) {
		
		kr.hs.dgsw.ch08.area.Circle c1 = new kr.hs.dgsw.ch08.area.Circle(1.5);
		kr.hs.dgsw.ch08.perimeter.Circle c2 = new kr.hs.dgsw.ch08.perimeter.Circle(2.5);
		System.out.println("반지름 1.5인 원의 넓이: " + c1.getArea());
		System.out.println("반지름 2.5인 원의 원주: " + c2.getPerimeter());

	}

}
