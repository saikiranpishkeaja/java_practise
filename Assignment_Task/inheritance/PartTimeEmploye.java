package inheritance;

public class PartTimeEmploye extends Employe {

	PartTimeEmploye(String name, String empId,int workHours, int amount) {
		super(name, empId);
		this.workHours=workHours;
		this.amount=amount;
	}

	int workHours;
	double amount;
	
	public int halfDay() {
		return (int) (workHours-amount);
	}
}
