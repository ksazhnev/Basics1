package sdetException;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	static void m1() throws IOException   {
		FileReader fr = new FileReader ("C:\\Test\\test.txt");
		BufferedReader bfr = new BufferedReader(fr);
		
		System.out.println(bfr.readLine());
	}
	
	public static void main(String[] args) throws IOException  //we had add exception 
	//because the same error occurs in previous method
	{

		m1();
		
		
	}

}
