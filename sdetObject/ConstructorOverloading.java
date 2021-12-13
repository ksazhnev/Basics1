package sdetObject;

public class ConstructorOverloading {

	ConstructorOverloading() { // 1 default constructor
		System.out.println("This is default constructor");
	}

	ConstructorOverloading(int a, int b) { // 2 parameterized constructor

		System.out.println(a + b);
	}

	ConstructorOverloading(int a, int b, int c) { // 3 parameterized constructor

		System.out.println(a + b + c);
	}

	ConstructorOverloading(double a, double b, double c) { // 4 parameterized constructor

		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co1 = new ConstructorOverloading(10,20);
		ConstructorOverloading co2 = new ConstructorOverloading(10,30,40);
		ConstructorOverloading co3 = new ConstructorOverloading(1.5,2.4,53.2);

	}

}
