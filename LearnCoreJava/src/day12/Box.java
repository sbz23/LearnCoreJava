package day12;

public class Box {
	
	double widht,height,depth;
	
	Box(){   //we cannot create multiple default constructors
		widht=height=depth=0;
	}
	
	Box(double w,double h,double d){
		widht=w;
		height=h;
		depth=d;
	}
	
	Box(double len){
		widht=height=depth=len;
	}
	
	double volume() {
		return(widht*height*depth);
	}
	

}
