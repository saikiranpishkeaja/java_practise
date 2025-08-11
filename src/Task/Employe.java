package Task;

public class Employe {
		
		public void work() {
	        System.out.println("Employee is working");
	    }

	    public double getSalary() {
	        return 3000.0;
	    }
	}

	
	class HRManager extends Employe {
	    
	    public void work() {
	        System.out.println("Active in work");
	    }

	    public void addEmploye() {
	        System.out.println("New hire of  HR Manager");
	    }
	}
	
