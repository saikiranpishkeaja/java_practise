package array_task;

import java.util.ArrayList;

public class ArrayList_String {

	int id;
	String name;
	double marks;
	
	ArrayList_String(int id, String name,double marks){
		this.id = id;
		this.name= name;
		this.marks = marks;
	}
	
	 void display_names() {
		System.out.println("ID: " +id+ ", NAME: " +name+ ", MARKS: "+ marks);
	}
	
	void searchName(ArrayList<ArrayList_String> std, String serach) {
		
		boolean found= false;
		for(ArrayList_String arr: std) {
			if(arr.name.equalsIgnoreCase(serach)) {
				System.out.println("\nSearch name found in Array");
				arr.display_names();
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println(serach+ "\nNot found in Array");
		}
	}
	
	static void searchId(ArrayList<ArrayList_String>std, int find) {
		boolean found =false;
		for(ArrayList_String s: std) {
			if(s.id==find) {
				System.out.println("\nSearch ID is found in Array");
				s.display_names();
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println(find+"\nNot found in array");
		}
	}
	
	


	public static void main(String[]args) {
		
		ArrayList<ArrayList_String> std= new ArrayList<>();
		std.add(new ArrayList_String(1,"Arjun",92.5));
		std.add(new ArrayList_String(2,"Maya",86.3));
		std.add(new ArrayList_String(3, "Peter", 78.9));
        std.add(new ArrayList_String(4, "Spoorthi", 96.2));
        
        for(ArrayList_String name :std) {
        	name.display_names();
        }
        
        ArrayList_String obj= new ArrayList_String(0, "", 0);
        obj.searchName(std,"ARJUN");
        
        searchId(std,3);
	}
}
