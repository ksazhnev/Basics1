package sdetObject;

public class StaticMain {

	
	public static void main(String[] args) {

		System.out.println(StaticExample.a); // can access because it is static variable

		//System.out.println(b); // cannot acces because it is non static variable
		
		StaticExample.m1();
	//	m2(); not possible because it is non static mehtod 
		
		//access non static via Object
		
		StaticExample st = new StaticExample();
		
		st.m2();
		
		st.m();
}
}