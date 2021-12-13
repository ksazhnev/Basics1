package sdetDay9Inheritance;

class ABC {
	void m1 (int a) {
		
		System.out.println(a);
	}
	
	void m2 (int b) {
		System.out.println(b);
	}
}
class XYZ extends ABC{
	
	void m1 (int a) { // method Overriding
		
		System.out.println(a*a);
	}
	void m2(int a, int b) { // method Overloading
		System.out.println(a+b);
	}
}

public class OverloadingOverriding {

	public static void main(String[] args) {
XYZ c1 = new XYZ();

c1.m1(5);

	}

}
