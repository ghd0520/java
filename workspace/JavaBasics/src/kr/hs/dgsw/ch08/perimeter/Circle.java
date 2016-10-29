package kr.hs.dgsw.ch08.perimeter;

public class Circle {

	double rad;
	final double PI=3.14;
	
	public Circle(double r){
		this.rad = r;
	}
	
	public double getPerimeter(){
		return 2*PI*rad;
	}
	
}
