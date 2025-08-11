package array_task;

public class Student {

	int id;
	String name;
	double marks;
	
	public Student(int id,String name,double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public void display() {
		System.out.println("ID: "+id + ", NAME: "+name + " ,MARKS: "+marks);
	}
	
	public static void searchName(Student[] student,String search) {
		boolean found =false;
		for(Student se: student) {
			if(se.name.equalsIgnoreCase(search)) {
				System.out.println("\nSearch Name found in array");
				se.display();
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("\n"+search+ " Not found in array");
		}
	}
	
	
	

	public static void main(String[]args) {
		
	Student std[]= new Student[4];
	std[0]= new Student(1,"Arjun",92.5);
	std[1]=new Student(2,"Maya",83.6);
	std[2]=new Student(3,"peter",78.9);
	std[3]=new Student(4,"spoorthi",96.2);
	
	for(Student s: std) {
		s.display();
	}
	
//	String searchName="kiran";
//	boolean found= false;
//	
//	 for(Student se: std) {
//		 if(se.name.equalsIgnoreCase(searchName)) {
//			 System.out.println("\nSearch Name found in array");
//			 se.display();
//			 found=true;
//			 break;
//		 }
//	 }
//	 if(!found) {
//		 System.out.println("\nNot found in array.. Mention correct name");
//	 }
	
	searchName(std, "ARJUN");
	searchName(std,"Kiran");
   }
}
