package conversionsSdet;

public class Conver {

	public static void main(String[] args) {

		String s = "1234";
		System.out.println(s.getClass().getName());
		
		
		//String to Integer conversion
		Integer num = Integer.parseInt(s); //Using integer class to call methods 
		System.out.println(num.getClass().getName());
		
		
		// Integer to String
		
		int num1 =101;
		String a = String.valueOf(num1);
		System.out.println(a.getClass().getName());
		
	
		
		String b = "12.5";
		Double d = Double.parseDouble(b);
		System.out.println(d.getClass().getName());
		
		//Double to String
		
		double dot = 10.5;
		String st = String.valueOf(dot);
		System.out.println(st.getClass().getName());
		
	}

}
