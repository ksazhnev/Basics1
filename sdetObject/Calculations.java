package sdetObject;

public class Calculations {
int x,y;
//1) No parameters No return value
	
//	void add() {
//		System.out.println(x+y);
//	}
	
	//2) No Params Return value
	
//	int add() {
//
//		return x+y;
//	}

//3) Take params No Return

//void add(int a, int b) {
//	
//	x=a;
//	y=b;
//	System.out.println(a+b);
//}

//4) Take params Return a value

int add(int a, int b) {
	
	
	
	return  a+b;
	
}
	
	public static void main (String [] args) {
		Calculations cal = new Calculations();
		
		
		
System.out.println(cal.add(100,200));
	}
}
