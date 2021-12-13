package sdetDay9Inheritance;

class Bank{

	double rateOfInterest() {
		return 0;
	}
}

class ICICI extends Bank{
	double rateOfInterest() {
		return 10.5;
	}
}

class AXIS extends Bank{
	double rateOfInterest() {
		return 12.5;
	}
}


public class Overrinding {

	public static void main(String[] args) {
Bank b =new Bank();
System.out.println(b.rateOfInterest());

ICICI iciciObj = new ICICI();
System.out.println(iciciObj.rateOfInterest());
AXIS axisiObj = new AXIS();
System.out.println(axisiObj.rateOfInterest());
	}

}
