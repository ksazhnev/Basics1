package sdetInterface;

interface ABC {
	int x = 100;

	void m1();
}

interface XYZ {
	int y = 200;

	void m2();
}

class PQR {

	int z = 300;

	void m3() {
		System.out.println(z);
	}
}

public class MultipleIheritance extends PQR implements ABC,XYZ 
{
public void m1 ()
{
	System.out.println(x);
}
public void m2()
{
	System.out.println(y);
}
	public static void main(String[] args) {

		MultipleIheritance mi = new MultipleIheritance();
		
		mi.m1();
		mi.m2();
		mi.m3();
	}

}
