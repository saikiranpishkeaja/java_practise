package Task;

public class Payment {
	
	double payAccount;
	
	public Payment(double payAccount) {
		this.payAccount=payAccount;
	}

	double makePayment(){
		return 50000;
	}
	
	public int paymentProcess() {
		return (int) payAccount;
	}

}

class CreditCard extends Payment {
	 
	int score;
	int bankBalance;
	
	CreditCard(double payAccount, int score, int bankBalance){
		super(payAccount);
		this.score=score;
		this.bankBalance=bankBalance;
	}
	
	public int paymentProcess() {
		return (int) payAccount;
	}
	
	int bankScore() {
		return score-bankBalance/100;
	}
	
	public void paymentCredited() {
		System.out.println("Payment is Credited in account");
	}
}

class DebitCard extends CreditCard {

	DebitCard(double payAccount, int score, int bankBalance) {
		super(payAccount, score, bankBalance);
		
	}
	
	int bankScore() {
		return score-bankBalance/100;
	}
	
	void paymentDebited() {
		System.out.println("Payment is Debited from account");
	}
}

class UpiPayment extends DebitCard {

	UpiPayment(double payAccount, int score, int bankBalance) {
		super(payAccount, score, bankBalance);
		
	}
	

	int bankScore() {
		return score-bankBalance/100;
	}
	
	void paymentTransfer() {
		System.out.println("Payment can do using Gpay,Phonepe etc..");
	}
	
}
