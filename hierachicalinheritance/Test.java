package hierachicalinheritance;

public class Test {

	public static void main(String[] args) {
		Bear b = new Bear();
		Fox f = new Fox();
		Monkey m = new Monkey();
		
		
		b.eyes();
		f.eyes();
		m.eyes();
		
		b.danger();
		f.Clever();
		m.food();

	}

}
