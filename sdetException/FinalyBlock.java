package sdetException;
import java.util.Scanner;
public class FinalyBlock {

public static void main(String[] args) {
System.out.println("Program is started...");

int a [] =new int [5]; // 0....4
Scanner sc = new Scanner (System.in);

System.out.println("Enter value:");

int num = sc.nextInt();

System.out.println("Enter position:");
int pos = sc.nextInt();

try {
	a[pos] = num;
}
catch(Exception e) {
	
	System.out.println("Exception Occured. Handeled...");
}
//finally will execute even when the exception is present or not
finally {
	
	System.out.println("FinalyBlock.main()");
	
	
	
}

	}

}
