package sdetObject;

public class VariableExample {
	int x;
	int y;
	static int c =100; //static variable will be same for every object, can be change at any object

	void getData(int x, int y) {
	
this.x=y; //this always represents the class
this.y=y; // represents the class
	}

	void display() {

		System.out.println(x);
		System.out.println(y);

	}

	public static void main(String[] args) {

	}

}
