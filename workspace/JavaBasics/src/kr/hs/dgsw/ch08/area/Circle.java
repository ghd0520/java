package kr.hs.dgsw.ch08.area;

public class Circle {
	
	double rad;
	final double PI = 3.14;
	
	public Circle(double r){
		this.rad = r;
	}
	
	public double getArea(){
		return PI*rad*rad;
	}
	
}
