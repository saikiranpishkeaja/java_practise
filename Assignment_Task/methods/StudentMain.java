package methods;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student=new Student();
		System.out.println(student);
		
		Student student2=new Student();
		System.out.println(student2);
		student2.id=20;
		
		System.out.println(student.equals(student2));
		System.out.println(student.hashCode());
		
//		String name = "sai";
//		String name2= "sai";
//		System.out.println(name.equals(name2));
	}

}
