package sdetDay9Inheritance;


class A{
	int a =100;
	void display() {
		
		System.out.println(a);
	}
}

class B extends A {
	
	int b =200;
	void show() {
		System.out.println(b);
	}
}

class C extends B{
	int c = 300;
	void print() {
		
		System.out.println(c);
	}
}
public class InheritanceTypes {

	public static void main(String[] args) {

		
//		A aObj = new A();
//		aObj.display(); //comes from A class
		
//		B bObj = new B();
//		
//		bObj.display();
//		bObj.show();
		
		C cObj = new C();
		cObj.a =10;
		cObj.b =20;
		cObj.c =30;

		
		cObj.display();
		cObj.show();
		cObj.print();
	}

}
