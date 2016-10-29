package kr.hs.dgsw.ch10;

class Circle{
	public static final double PI = 3.1415;
	private double radius;
	
	public Circle(double r){
		this.radius = r;
	}
	public void showPerimeter(){
		double peri = 2*PI*radius;
		System.out.println("둘레: " + peri);
	}
	public void showArea(){
		double area = PI*radius*radius;
		System.out.println("넓이: " + area);
	}
}

public class ClassVarUse {

	public static void main(String[] args) {
		
		System.out.println("원주율: " + Circle.PI);
		Circle c = new Circle(2.5);
		c.showPerimeter();
		c.showArea();
		
	}

}
