package Task;

public class Fruit {
	
	void name() {
		System.out.println(" Favourite name: Mango");
	}

	void colour() {
		System.out.println("I like the mango which is converted to Yellow");
	}
}

class Apple extends Fruit {
	void name() {
		System.out.println("It's doctor medicine");
	}

	void colour() {
		System.out.println("It's color is reddish");
	}
}

class Banana extends Fruit {
	void name() {
		System.out.println("It good for morning bad to ate n8");
	}

	void colour() {
		System.out.println("It color is Yellow");
	}
}
