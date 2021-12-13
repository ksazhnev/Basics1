package bptfirstprogram;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int MonthNumber = scanner.nextInt();

		if (MonthNumber == 1) {
			System.out.println("January");
		} else if (MonthNumber == 2) {
			System.out.println("February");
		} else if (MonthNumber == 3) {
			System.out.println("March");
		} else if (MonthNumber == 4) {
			System.out.println("April");
		} else if (MonthNumber == 5) {
			System.out.println("May");
		} else if (MonthNumber == 6) {
			System.out.println("June");
		} else if (MonthNumber == 7) {
			System.out.println("July");
		} else if (MonthNumber == 8) {
			System.out.println("August");
		} else if (MonthNumber == 9) {
			System.out.println("September");
		} else if (MonthNumber == 10) {
			System.out.println("October");
		} else if (MonthNumber == 11) {
			System.out.println("November");
		} else if (MonthNumber == 12) {
			System.out.println("December");
		} else {
			System.out.println("The number is invalid, please try again");
		}

	}

}
