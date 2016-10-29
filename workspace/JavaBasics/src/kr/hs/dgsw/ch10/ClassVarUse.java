package kr.hs.dgsw.ch10;

class Circle{
	public static final double PI = 3.1415;
	private double radius;
	
	public Circle(double r){
		this.radius = r;
	}
	public void showPerimeter(){
		double peri = 2*PI*radius;
		System.out.println("�ѷ�: " + peri);
	}
	public void showArea(){
		double area = PI*radius*radius;
		System.out.println("����: " + area);
	}
}

public class ClassVarUse {

	public static void main(String[] args) {
		
		System.out.println("������: " + Circle.PI);
		Circle c = new Circle(2.5);
		c.showPerimeter();
		c.showArea();
		
	}

}
