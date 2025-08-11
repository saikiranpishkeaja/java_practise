package Task;

public class Main_Payment {

	public static void main(String[] args) {
		
//		UpiPayment pay=new UpiPayment(17000.0, 780,10000);
//		pay.paymentProcess();
//		pay.makePayment();
//		
//		CreditCard cre= new CreditCard(13000.0,530 ,16000);
//		cre.BankScore();
//		cre.PaymentCredited();

		
		 UpiPayment pay = new UpiPayment(17000.0, 780, 10000);
	        System.out.println("UPI Payment Process: " + pay.paymentProcess());
	        System.out.println("Credit Card Bank Score: " + pay.bankScore());
	        System.out.println("UPI Payment Amount: " + pay.makePayment());
	        pay.paymentProcess(); // Call to demonstrate functionality
	      System.out.println("---------------------------");
	      
	        CreditCard cre = new CreditCard(13000, 530, 16000);
	        System.out.println("Credit Card Bank Score: " + cre.bankScore());
	        cre.paymentCredited();
	        System.out.println("Credit Payment Amount: " + cre.makePayment());
	        System.out.println("Credit Payment Process: " + cre.paymentProcess());
	        System.out.println("-----###########-----");
	        
	        Payment p= new Payment(7000);
	        System.out.println("paying the account :"+p.paymentProcess());
	
	}

}


// 9703162444, 9177589845, talent nest it
