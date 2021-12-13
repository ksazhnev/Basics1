package sdetException;

public class CheckedExceptions {

	
	
	public static void main(String[] args) throws InterruptedException {

		System.out.println("started...");
		System.out.println("inprigress...");

		try {
			Thread.sleep(5000);
			System.out.println("try block");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread.sleep(5000);
		
		System.out.println("completed...");
		System.out.println("Finished...");

		
		
	}

}
