package sdetException;

import java.util.Scanner;

public class ExeptionsDemo {

	public static void main(String[] args) {

		
	//	Scanner sc =new Scanner (System.in);
		
		// num2  = sc.nextInt();
		//double num = sc.nextDouble();
		//String num = sc.nextLine();
		
	//	System.out.println(num2);
		
		//ArrayIndexOutOfBounceException
		//Try Catch block to catch the Exception
		// Can use common kword for all tyoe of exeptions catch(Exception e)
		
		System.out.println("Enter any numeric value");
		Scanner sc =new Scanner (System.in);
		int value = sc.nextInt();
		
		int a [] = new int [5];
		System.out.println("Enter any index from 0 to 4");
		int index = sc.nextInt();
try
{
	a [index] = value;
}
catch (ArrayIndexOutOfBoundsException e) {
	
	System.out.println("Invalid Index number");
	System.out.println(e.getMessage());
	e.printStackTrace();
}
	try {
	System.out.println(a[index]);
	}
	catch (ArrayIndexOutOfBoundsException e){
		
	}
		System.out.println("The program is completed");
		
		//NumberFormatException
		
		//NumberFormatException
//		String s = "abc";
//		int num = Integer.parseInt(s); //convert String numbers to numbers
//		
//		System.out.println(num);
//		
		
//		//NullpointerException
//		String s = null;
//		System.out.println(s.length());
//		
		
		
		
	}

}
