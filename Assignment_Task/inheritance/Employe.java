package inheritance;

public class Employe {
   
	String name;
	String empId;
	
	Employe(String name, String empId) {
		this.name=name;
		this.empId=empId;
	}
	
	public int salary() {
		return 30000;
	}
	
	int halfDay() {
		return 750;
	}
	
}
