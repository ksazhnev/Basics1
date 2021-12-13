package SDET;

public class StringPractice {

public static void main(String[] args) {
String s = "Welcome";

//length(); returns the length of the string
System.out.println(s.length());

//concat() joins the strings

System.out.println("abs"+"akd");

String s1 = "welcome";
String s2 = "to java";
String s3 = "automation";

System.out.println(s1+s2);


System.out.println(s1.concat(s2));
System.out.println(s1.concat(s2).concat(s3));
System.out.println(s1.concat(" "+s2).concat(" "+s3));


//trim()

s="      Automation    ";
System.out.println(s);
System.out.println(s.length());

System.out.println(s.trim().length());
System.out.println(s.trim());

//charAt() returns a single chatacter based on the index

s="welcome";

System.out.println(s.charAt(3)); //c 3 index, index is starts from 0
// contains() returns a boolean value true/false

s= "Selenium";

System.out.println(s.contains("Sel"));

// equals() equalsIgnoreCase()

System.out.println(s.equals("Selenium")); //true
System.out.println(s.equals("selenium")); //false
System.out.println(s.equalsIgnoreCase("selenium"));// true

System.out.println(s=="Selenium");//true
System.out.println(s== "selenium" );//false

//replace() replace single/multiple/sequence of characters 

s="welcome to selenium automation testing";

System.out.println(s.replace('e','X'));//wXlcomX to sXlXnium automation tXsting


System.out.println(s.replace("selenium","java")); //welcome to java automation testing

//substring() extract substring of the main method ( starting index, ending index).
//staring index starts from 0 ending index starts from 1

s="Welcome";

System.out.println(s.substring(0,3));// Wel


System.out.println(s.substring(3,7));//come

//toUpperCase() & toLowerCase()

s= "WeLCOME";

System.out.println(s.toUpperCase());

System.out.println(s.toLowerCase());






	}

}
