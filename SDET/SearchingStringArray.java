package SDET;

public class SearchingStringArray {

	public static void main(String[] args) {

String emp_names [] = {"David","Scott", "Smith", "Mary", "John"};
boolean flag = false;
String search_name ="Scott";

for(String n: emp_names)
{
	if (n.equals(search_name)) {
		System.out.println("Name found");
		flag = true;
		break;
	}
}
if(flag == false) {
System.out.println("Name not found");
	

	}

}
}