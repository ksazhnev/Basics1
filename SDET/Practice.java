package SDET;

import java.util.Arrays;
import java.util.Collections;

public class Practice {

	public static void main(String[] args) {

		/*
		 * //Summary of arrays digits int a [] = {1,2,3,4,5}; int sum = 0; for(int x =
		 * 0; x<a.length; x++) { sum = sum + a[x]; }
		 * 
		 * System.out.println("Sum of array digits "+sum);
		 * 
		 * int newsum = 0; for(int e:a) { newsum=newsum+e; }
		 * System.out.println("Enhanced loop sum of arrays "+ newsum);
		 */

		// Count number of odd and even numbers in array

		/*
		 * int a []= {1,2,3,4,5,6,7,8,9}; int even=0; int odd=0; for (int x:a) {
		 * if(x%2==0) { even++; } else { odd++; } }
		 * 
		 * System.out.println("Even "+even+" Odd " +odd);
		 */

		/*
		 * int a [] = {10,20,90,30,40,50}; int max =a[0]; int min = a[0]; for(int x:a) {
		 * if(max<x) { max = x; } if(min >x) { min =x; } }
		 * 
		 * System.out.println("minimum value is " + min);
		 * System.out.println("maximum value is " +max);
		 */

		// Find number using for loop

		/*
		 * int a[] = { 10, 20, 30, 40, 50,100 }; int n30 = 0; int n100 = 0; for (int i =
		 * 0; i < a.length; i++) { if (a[i] == 30) { n30 =a[i]; }
		 * 
		 * if (a[i] == 100) { n100 = a[i]; }
		 * 
		 * }
		 * 
		 * if (n30 == 30) { System.out.println(" Element 30 is found"); } else {
		 * System.out.println(" Element 30 is not found");
		 * 
		 * } if (n100 == 100) { System.out.println("Element 100 is found"); } else {
		 * System.out.println(" Element 100 is not found"); }
		 */

		/*
		 * // Binary search logic int a [] = {1,2,3,4,5,6,7,8,9,10}; int key = 11;
		 * boolean flag =false; int l = 0;
		 * 
		 * int h = a.length-1;
		 * 
		 * 
		 * while(l<=h) {
		 * 
		 * int m =(l+h)/2;
		 * 
		 * if(a[m]== key) { System.out.println("Element found"); flag=true; break; } if
		 * (a[m]<key) { l=m+1; } if (a[m]>key) { h=m-1; } }
		 * 
		 * if(flag==false) { System.out.println("Element is not found"); }
		 */

		/*
		 * // Using Arrays Search function int a [] = {15,235,624,110,156,163,634,1000};
		 * 
		 * System.out.println(Arrays.binarySearch(a,1000 ));
		 */

		/*
		 * //Sorting out the numbers using Buble sort int a[] = { 50, 20, 40, 10, 1000
		 * }; int n =a.length; System.out.println(n );
		 * 
		 * System.out.println("Array before sorting " + Arrays.toString(a));
		 * 
		 * for (int i = 0; i < n-1; i++) {
		 * 
		 * for (int j = 0; j < n-1; j++) {
		 * 
		 * if (a[j] > a[j + 1]) {
		 * 
		 * int temp = a[j];
		 * 
		 * a[j] = a[j + 1];
		 * 
		 * a[j + 1] = temp; } } }
		 * 
		 * System.out.println("Sorted array " + Arrays.toString(a));
		 */

		
		/*
		 * //Arrays sorting using function parallelsort
		 * 
		 * int a []= {20,50,10,40,30};
		 * System.out.println("Array elements before sorting " +Arrays.toString(a));
		 * Arrays.parallelSort(a);
		 * 
		 * System.out.println("Array elemets after sorting " +Arrays.toString(a));
		 */
		 

		// Array list sorting using SORT function
		/*
		  int a []= {20,50,10,40,30};
		  System.out.println("Array elements before sorting "+Arrays.toString(a));
		  Arrays.sort(a);
		  System.out.println("Array elements after sorting "+Arrays.toString(a));
		 */

		// Reverse sorting Descending order using Collections
		/*
	*/

	}
}
