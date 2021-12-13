package parameters;

public class AdressParameters {
	
	static String cityName;
	static int zipCode;
	static String state;

	static void location(String cityName, int zipCode, String state) {

		AdressParameters.cityName = cityName;
		
	}
		static void show() {
			System.out.println("The city name is  "+cityName+" zip code is "+zipCode+ " state " +state);
		}
	

	public static void main(String[] args) {

location("Alexandria",20022,"VA");
show();
location("Falls Church",20342,"VA");
show();
location("Mclean",34452,"VA");
show();
location("Ashburn",23445,"VA");
show();
location("Vienna",23445,"VA");
show();
		
	}

}
