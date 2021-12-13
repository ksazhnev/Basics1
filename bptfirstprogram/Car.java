package bptfirstprogram;

public class Car {
	String color;
	int horsepower;
	int milesPerGallon;
	String body;

	public static void main(String[] args) {
		Car Toyota = new Car();
		Car Tesla = new Car();
		Car Mercedes = new Car();
	
		
		Toyota.color="Silver";
		Toyota.horsepower = 200;
		Toyota.milesPerGallon = 27;
		Toyota.body = "Sedan";
		Tesla.color = "Black";
		Tesla.horsepower = 280;
		Tesla.milesPerGallon = 40;
		Tesla.body = "Sedan";
		Mercedes.color = "white";
		Mercedes.horsepower = 390;
		Mercedes.milesPerGallon = 18;
		Mercedes.body = "Sport";
		
		System.out.println("Toyota " + "Color: " +Toyota.color+ "Horsepower: " + Toyota.horsepower+ "Miles per gallon; " +Toyota.milesPerGallon+ "Body Tyoe; "+Toyota.body);
		
	}

}
