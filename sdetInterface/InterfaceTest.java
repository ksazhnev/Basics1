package sdetInterface;


interface A{
	int a =10;
	int b=5;
	
	void sum(int a);
	
}
public class InterfaceTest implements A {
public void sum(int a) {
	System.out.println(a+b);
}
	public static void main(String[] args) {

		InterfaceTest m1 = new InterfaceTest();
		
		m1.sum(15);
	}

 
}
