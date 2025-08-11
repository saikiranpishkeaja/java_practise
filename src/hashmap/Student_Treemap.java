package hashmap;

import java.util.Comparator;
import java.util.TreeMap;

//Define the Student class
	class Student {
	    String name;
	    int marks;

	    Student(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }

	    // This helps print the student details clearly
	    public String toString() {
	        return name + " (" + marks + ")";
	    }
	}

public class Student_Treemap {
	
	    public static void main(String[] args) {

	        // Comparator to sort by marks (high to low),
	        // and break ties using name (alphabetical order)
	        Comparator<Student> marksComparator = (s1, s2) -> {
	            int result = Integer.compare(s2.marks, s1.marks); // Descending marks
	            if (result == 0) {
	                return s1.name.compareTo(s2.name); // Tie-breaker: ascending name
	            }
	            return result;
	        };

	        // TreeMap with custom sorting logic
	        TreeMap<Student, String> marksMap = new TreeMap<>(marksComparator);

	        // Adding student entries
	        marksMap.put(new Student("Maya", 95), "Maths");
	        marksMap.put(new Student("Maya", 99), "Science");
	        marksMap.put(new Student("Kiran", 95), "Telugu");
	        marksMap.put(new Student("Mike", 90), "Hindi");

	        // Display all entries in sorted order
	        System.out.println("Student Marks and Subjects:");
	        marksMap.forEach((student, subject) ->
	            System.out.println(student + " : " + subject)
	        );
	    }

}
