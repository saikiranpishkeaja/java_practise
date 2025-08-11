package chandra_sprint;

public class Professor {

	String professor_Name;
	
	Professor(String professor_Name){
		this.professor_Name= professor_Name;
	}
}

class Department {
	String name;
	public Professor[] professors;
	
	Department(String name,	Professor[] professors ){
		this.name= name;
		this.professors = professors;
	}


 void display() {
	 System.out.println(name);
	 System.out.println("department");
	 
	 for(Professor professor : professors) {
		 System.out.println(professor.professor_Name);
	 }
 }
}
