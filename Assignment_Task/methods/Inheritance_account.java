package methods;

public class Inheritance_account extends Friends{
	
	void bonded() {
		System.out.println("Help in relation ");
	}
	void bonded(int value) {
		System.out.println("value can't teach u more");
	}
    public static void main (String[]args) {
    	Friends f1=new Friends();
    	f1.frnd;
    
    }
}

class Maa {
	
	int x;
	int money;
	void maa() {
		System.out.println("Maa call");
	}
	
     void maa(int money) {
		this.money=money;
		System.out.println("maa gave money");
	}
}


class Relation extends Maa {
	
	void bro() {
		super.maa(10);
		this.money=money;
		System.out.println("Relation brother");
	}
	void bro(int money) {
		this.money= money;
		System.out.println("Helping in trouble situation");
	}
}

class Friends extends Relation{

	void frnd() {
		System.out.println("Friendship");
	}
	void frnd(int bond) {
		System.out.println(" Friendship forever");
	}
}


