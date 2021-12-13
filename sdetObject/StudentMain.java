package sdetObject;

public class StudentMain {

	public static void main(String[] args) {
//Student stu = new Student();

//Approach 1 by using object reference variable
//stu.sid = 101;
//stu.sname = "Smith";
//stu.grade = 'A';
//
//stu.show();

//Approach 2 y using method


//stu.setData(101,"Smith", 'A');
//
//stu.show();

	
	
	//Approach 3 using constructor
	
	Student stu = new Student(101, "Smith",'A');
	
	stu.show();
	
	


}}
