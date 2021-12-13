package SDET;

public class TwoDimensionalArrays {

	public static void main(String[] args) {

//int a [] []=new int[3][2];
	//	int [][]a=new[1][2];
		/*Approach1
		int [] a[] = new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
	
		
		System.out.println(a[0][0]);*/
		
		
		int a [][]= {{200,300,500,600},//row 1
					{300,400},			// row 2
					{500,600}   ,
					{ 132,234}};		
		
		//specific value
		System.out.println(a[0][3]);
		
		//find size
		
		System.out.println(" Number of rows is " +a.length); //Number of rows
		System.out.println(" Number of columns " +a[0].length); // Number of columns specified by a row
		
		//print all values for loop
		
		for(int r=0; r<a.length; r++ ) {
			for ( int c =0;c<a[r].length; c++) {
				
				System.out.print(a[r][c]+ " ");
				
			}
			System.out.println();
		//Using enhanced for loop
				
//		for(int x[]:a) {
//			for(int val:x) {
//				System.out.print(val+ " ");
//				
//				
//			}
//			System.out.println();}
			
			
			
		
		
	}
	}}
