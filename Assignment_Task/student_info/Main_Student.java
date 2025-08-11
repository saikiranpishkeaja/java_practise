package student_info;

public class Main_Student {

	    public static void main(String[] args) {
	    	Student_DisplayDetails manager = new Student_DisplayDetails(30);
	        
	      
	        manager.addStudent(234, "SALAAR", "  ENGLAND britain");
	        manager.addStudent(345, "DEVARA VARA", "  CANADA");
	        manager.addStudent(456, "ROCKY BHAI", ",  USA LOS ANGLES");
	        
	        
	        System.out.println("----- Add Total_Student List ----");
	        manager.displayAllStudents();
	        
	        
	        boolean updated = manager.updateStudent(234, " Robert Williams", "  Boston");
//	        System.out.println("-------- After Update (" + (updated ? "success" : "failed") + ") ---------");
	        if (updated) {
	            System.out.println("[SUCCESS] Student updated");
	        } else {
	            System.out.println("[ERROR] Student ID 234 not found");
	        }
	        manager.displayAllStudents();
	        
	        
	        boolean deleted = manager.deleteStudent(345);
	        System.out.println("---------------DDDDDDDDDDDD------------");
//	        System.out.println("---------- After Delete (" + (deleted ? "success" : "failed") + ") ----------");
	        if (deleted) {
	            System.out.println("[SUCCESS] 345 Student deleted");
	        } else {
	            System.out.println("[ERROR] Student ID 345 not found");
	        }
	        
	        manager.displayAllStudents();
	        
	        
	        Student found = manager.findStudent(456);
	        System.out.println("------------FFFFFFFFFFFF------------");
	        System.out.println("---- Find Student ---");
//	        System.out.println(found != null ? found : "Student not found");
	        if (found != null) {
	            System.out.println("[SUCCESS] Student ID 456 found the Student ");
	        } else {
	            System.out.println("[ERROR] Not Find Student ID 456 not found");
	        }
	    }
	}


