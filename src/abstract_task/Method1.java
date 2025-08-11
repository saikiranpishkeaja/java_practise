package abstract_task;

abstract class University{
	
	static int total_clg= 100;
	int universiy_std= 1000;
	int staff;
	int allstd;
	
	public static void college(){
		System.out.println("Following the rules");
	}
	abstract void uniqueClg();
	
	public int professor(int staff){
		System.out.println("Total professor strength");
		return staff;
		
	}
	 int total_std(int allstd) {
		System.out.println("Total_std ");
		return allstd;
	}
	 
	 abstract void passStudent();
	 abstract void failStudent();
}

abstract class Colleges extends University{
	
	void passStudent() {
		System.out.println("Individual Student result");
	}
	void failStudent() {
		System.out.println("Found fail student");
	}

}

 class Method1 extends Colleges {
	
	void uniqueClg() {
		System.out.println("Individual Rules");
	}

	public static void main(String[] args) {
		
		System.out.println(University.total_clg);
		
		System.out.println(Method1.University_std);
		
		University.college();
		
		new University.university_std;
		
		
		
		Method1 un = new Method1();
		un.passStudent();
		un.failStudent();
		un.uniqueClg();
		
		un.staff=500;
		un.allstd=1200;
		
		un.professor(un.staff);
		un.total_std(un.allstd);
		
		
		
	}

}
