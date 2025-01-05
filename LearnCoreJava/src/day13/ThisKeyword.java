package day13;

public class ThisKeyword {  //this keyword represents class name
	
	int x,y;  //instance/class variables
	
	void setData(int x,int y) { //a,b are local variables
		this.x=x;
		this.y=y;
	}
	
	void Display() {
		System.out.println(x+"  "+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword th = new ThisKeyword();
		th.setData(10,20);
		th.Display();
		

	}

}
