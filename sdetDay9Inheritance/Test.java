package sdetDay9Inheritance;

public class Test {
	public static void main (String [] args) {
		
		
		Dog d1 = new Dog();
		d1.display();
		
	}
}
class Animal{
	String color ="white";
void eat() {
	
	System.out.println("eating...");
}}

class Dog extends Animal{
	
	String color = "black";
	void eat() {
		
		System.out.println("eating bread...");}

	void display() {
		System.out.println(color);
		System.out.println(super.color);
		eat();
		super.eat();
	}}




