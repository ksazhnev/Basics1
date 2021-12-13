package bptfirstprogram;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		int b = 50;
		int c = 30;
		if (a > b && a > c) {

			System.out.println("a is the larges number " + a);
		} else if (b > a && b > c) {
			System.out.println("b is the largest number " + b);
		} else if (c > a && c > b) {
			System.out.println("c is the larget number " + c);

		}

		int weekno = 5;

		switch (weekno) {

		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid week number");

		}
	}

}
