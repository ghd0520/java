package kr.hs.dgsw.ch07;

public class Triangle {

	int height;
	int width;
	
	Triangle(){
		height=10;
		width=10;
	}
	
	Triangle(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	double calculator(){
		return height*width/2;
	}

}
