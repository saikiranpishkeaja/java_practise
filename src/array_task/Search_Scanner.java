package array_task;

import java.util.Scanner;

public class Search_Scanner {

	int id;
	String name;
	double marks;
	
	public Search_Scanner(int id, String name, double marks) {
		this.id =id;
		this.name =name;
		this.marks=marks;
	}
	
	public void display_items() {
		System.out.println("ID : "+id+" Name: "+name+ " Marks :"+marks);
	}
	
	public static void main(String[]args) {
		
		Search_Scanner std[] = new Search_Scanner[4];
		
		std[0]=new Search_Scanner(1,"Arjun",92.5);
		std[1]=new Search_Scanner(2,"Maya",83.6);
		std[2]=new Search_Scanner(3,"peter",78.9);
		std[3]=new Search_Scanner(4,"spoorthi",96.2);
		
		for(Search_Scanner s: std) {
			s.display_items();
		}
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("\nEnter the search Name:");
		String searchName= sc.nextLine();
		
		boolean found= false;
		for(Search_Scanner se : std) {
			if(se.name.equalsIgnoreCase(searchName)) {
				System.out.println("\nSearch name found in Array");
				se.display_items();
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("\n" +searchName+ "Notfound in ARray");
		}
	}
}
