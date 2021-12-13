package SDET;

public class Forloop {
	public static void main(String[] args) {
		
		  
		/*
		 * int num = 123; int comparison = num; int rev = 0;
		 * 
		 * while (num != 0) { rev = rev * 10 + num % 10;
		 * 
		 * num = num / 10;
		 * 
		 * } System.out.println("reverse number is " + rev);
		 * 
		 * if(comparison == rev) { System.out.println("The numbers are Palindrome"); }
		 * else { System.out.println("The numbers are not Palindrome"); }
		 * 
		 */

		
		/*
		 * int palindrome = 455616144; int check = 0;
		 * 
		 * int comp = 0; check = check + palindrome % 10; // check = 4 palindrome =
		 * palindrome / 10; // palindrome = 45561614
		 * 
		 * 
		 * while (palindrome != 0) { int enter = palindrome / 10; //enter = 0
		 * 
		 * if (enter == 0) { comp = comp + palindrome % 10; }
		 * 
		 * palindrome = palindrome / 10; //palindrome = 4 }
		 * 
		 * if (check == comp) {
		 * System.out.println("Last and first numbers are matching");
		 * 
		 * } else { System.out.println("Last and first numbers are not matching");
		 * 
		 * 
		 * }
		 */

		/*
		 * // 2. String buffer
		 * 
		 * c StringBuffer sb = new StringBuffer(String.valueOf(num)); sb
		 * =sb.reverse();
		 * 
		 * //convert back to int if needed // String gt = sb.toString(); // int b =
		 * Integer.parseInt(gt);
		 * 
		 * 
		 * System.out.println("Reverse Number is: "+sb);
		 */
		 

//3. String Builder
		/*
		 * int num = 1234; StringBuilder sbl = new StringBuilder().append(num);
		 * StringBuilder rev = sbl.reverse();
		 * 
		 * System.out.println("Reverse number is: "+rev);
		 */
		 

		/*
		 * // number count
		 * 
		 * long num = 6543649909L;
		 * 
		 * int count = 0;
		 * 
		 * while (num > 0) { count++;
		 * 
		 * num = num /10;
		 * 
		 * } System.out.println("Numbers of digits in the number is " + count);
		 */
		 

		/*
		 * int num = 6666999;
		 * 
		 * int rev = 0;
		 * 
		 * int even = 0; int odd = 0; while (num != 0) {
		 * 
		 * rev = num % 10; if (rev % 2 == 0) {even++;
		 * 
		 * } else {
		 * 
		 * odd++; }
		 * 
		 * num = num / 10;
		 * 
		 * } System.out.println("Odd Number is " + odd + " Even number is " + even);
		 */
		 

		
		/*
		 * int num = 1234; int sum = 0;
		 * 
		 * while (num != 0) { sum = sum + num % 10;
		 * 
		 * num = num / 10;
		 * 
		 * }
		 * 
		 * System.out.println("Sum of the numbers is " +sum);
		 */

		/*
		 * for (int num = 25; num <= 88; num++) {
		 * 
		 * if (num % 2 == 0) { System.out.println(num); } }
		 */
		
		
		}}

