package sdetObject;

public class StaticExample {

	static int a = 10; // static

	int b = 20; // non- static

	static void m1() { // static
		System.out.println("This is static method...");

	}

	void m2() { // non static

		System.out.println("This is non static method...");
	}

	
	
	
	static void m() {

		
		System.out.println(a);
		StaticExample st = new StaticExample();

		System.out.println(st.b);
			m1();
			
			st.m2();
	}
	
	 
	
	public static void main(String[] args) {

		System.out.println(a); // can access because it is static variable

		//System.out.println(b); // cannot acces because it is non static variable
		
		m1();
	//	m2(); not possible because it is non static mehtod 
		
		//access non static via Object
		
		StaticExample st = new StaticExample();
		
		
		st.m2();
		
		m();
		
		
		// cannot access the same way in another class have to specify claa name . method
		
		
	}

}
