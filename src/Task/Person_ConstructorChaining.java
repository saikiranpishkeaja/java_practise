package Task;

public class Person_ConstructorChaining {
	int money;
	int balance;
	
	Person_ConstructorChaining(){
		this.money=0;
	}
	
	Person_ConstructorChaining(int money, int balance){
		this.money=money;
		this.balance=balance;
	}
	
	void work() {
		System.out.println("working as JAVA DEVELOPER");
	}
	
	void salary(int money) {
		this.money=money;
		System.out.println("package is "+money+"LPA");
	}
}

class Employee extends Person_ConstructorChaining {
	int account;
	int bankBalance;
	 
	Employee(){
		super();
		this.account=0;
	}
	Employee(int account, int bankBalance){
		super(account,bankBalance);
	}
	
	
	void work() {
		System.out.println("working on project");
	}
	
	void balance(int account) {
//		super.salary(account);
		this.account=account;
		System.out.println("my balance is : "+account);
	}
}