package bptfirstprogram;

public class Me {
	
	public static void main(String[] args) {
		String FavoriteFood = "Soup";
		String FavoriteColor = "Yellow";
		int NumberOfSiblings = 2;
		
		System.out.println("My favorite food is " +FavoriteFood);
		System.out.print("And my favrite color is " +FavoriteColor);
		
		String SinglePlural = " sibling";
				
		if (NumberOfSiblings >1 || NumberOfSiblings == 0) { //adding s if the number of siblings is more than 1 or ==0
			SinglePlural = " sibling"+"s";
		} 
		
		System.out.println ( " I have "+ NumberOfSiblings+SinglePlural);
		
}}