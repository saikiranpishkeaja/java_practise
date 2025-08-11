package Task;

public class Main {

	public static void main(String[] args) {
		
		        Employe emp = new Employe();
		        emp.work();
		        System.out.println("Salary: " + emp.getSalary());

		        HRManager hr = new HRManager();
		        hr.work(); 
		        System.out.println("Salary: " + hr.getSalary());
		        hr.addEmploye(); 

	}

}
