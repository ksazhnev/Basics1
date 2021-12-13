package sdetObject;

public class MethodOverloading {

	int x, y, z;
	double d;

	
	void sum() {
		x=1;
		y=2;
		
		System.out.println(x+y);
		
	}
	
	void sum(int a, int b) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a, double b) {
		x=a;
		d=b;
		System.out.println(x+d);

	}
	
	
	void sum(int a, int b, int c) {
		x=a;
		y=b;
		z=c;
		System.out.println(x+b+c);
		
	}
	public static void main(String[] args) {

		
		MethodOverloading met = new MethodOverloading();
		
		met.sum(100,200);
		met.sum(100,200,300);
		met.sum (100, 10.5);
		met.sum();
		
	}

}
