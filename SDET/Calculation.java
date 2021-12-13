package SDET;

public class Calculation {

	
	int sum (int x, int y) {
		
		return x + y;
	}
	
	int sum (int x, int y, int z) {
	
		return x+y+z;	
		
	}
	
	double sum (double x, double y) {
		return x+y;
		
	}
	double sum (double x, double y, double z) {
		
		return x + y +z;
	}
	public static void main(String[] args) {

		Calculation cal = new Calculation();
		
		System.out.println(cal.sum(5,3));
		System.out.println(cal.sum(5,3,5));
		System.out.println(cal.sum(5.3,3.4));
		System.out.println(cal.sum(5.3,54.2,3.4));
		System.out.println(cal.sum(5,6));
		
		
	}

}
