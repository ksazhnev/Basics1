package bptfirstprogram;

public class Houses {
	int NumOfbedrooms;
	int NumOfBathrooms;
	int NumOfFloors;
	String Color;

	public static void main(String[] args) {

		Houses SingleFamily = new Houses();
		Houses Appartments = new Houses();

		SingleFamily.NumOfbedrooms = 4;
		SingleFamily.NumOfBathrooms = 2;
		SingleFamily.NumOfFloors = 2;
		SingleFamily.Color = "Gray";
		Appartments.NumOfbedrooms = 3;
		Appartments.NumOfBathrooms = 1;
		Appartments.NumOfFloors = 1;
		Appartments.Color = "White";

	}

}
