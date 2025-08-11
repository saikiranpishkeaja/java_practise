package methods;

public class EmiReport {

	public static void main(String[] args) {
		
		    double loanAmount = 12000;   
	        double emi = 1000;            
	        double remainingBalance = loanAmount;

	        System.out.println("Month - EMI Paid - Remaining Balance");

	        for (int month = 1; month <= 12; month++) {
	            remainingBalance -= emi; 

	            
	            if (remainingBalance < 0) {
	                remainingBalance = 0;
	            }

	            System.out.println("  " +month + " - " + emi + " - " + remainingBalance);
	        }

	}

}
