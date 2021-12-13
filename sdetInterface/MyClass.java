package sdetInterface;

interface I{
	int a =10; // final static
	 void display(); //abstract method
	
	default void sqaure() { //From java 8 default methods allowed
		System.out.println (a*a);
		
	}
	
}





public class MyClass implements I
{
	
	 public void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {

		
		MyClass mc = new MyClass();
		//I md = new MyClass(); //Also can use interface object reference but not instantiate
		mc.display();
		mc.sqaure();
	}


	

}
