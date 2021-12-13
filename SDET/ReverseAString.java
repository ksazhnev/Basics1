package SDET;

public class ReverseAString {

	public static void main(String[] args) {
	
	String str = "adam";
	String rev = "";
	
	int len = str.length();  
	
	for (int i = len-1; i>=0; i--) {
		
		
		rev = rev+str.charAt(i);
		
		
	}
	System.out.println(rev);//emoclew
	
	//Check Palindrome or not
	
	if(str.equals(rev)) {
		
		System.out.println("Palindrome string...");
		
	}else {
		System.out.println("Not a Palindrome string");
	}
}
	
	
}