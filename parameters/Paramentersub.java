package parameters;

public class Paramentersub {

	static void substraction(int a, int b) {
		System.out.println(a - b);
	}

	static void addition(int a, int b) {
		System.out.println(a + b);
	}

	static void mul(int a, int b) {
		System.out.println(a * b);
	}

	static void div(int a, int b) {
		System.out.println(a / b);

	}

	public static void main(String[] args) {

		System.out.println("Substruction");
		substraction(12, 5);
		substraction(55, 1);
		substraction(12, 4);
		System.out.println("addition");

		addition(12, 5);
		addition(55, 1);
		addition(12, 4);
		System.out.println("Multiplicaiton");

		mul(12, 5);
		mul(55, 1);
		mul(12, 4);
		System.out.println("Division");

		div(12, 5);
		div(55, 1);
		mul(12, 4);

	}

}
