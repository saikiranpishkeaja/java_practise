package hashmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class MapSort_AllKeyValue {


	public class SortMapByStudentValues {
	    public static void main(String[] args) {
	    	
	        // Map with rollNo as key, Student as value
	        Map<Integer, Student> map = new HashMap<>();

	        map.put(3, new Student(3, "Alice", 85));
	        map.put(1, new Student(1, "Bob", 85));
	        map.put(2, new Student(2, "Bob", 85));
	        map.put(4, new Student(4, "Charlie", 75));

	        // Convert entrySet to List
	        List<Map.Entry<Integer, Student>> list = new ArrayList<>(map.entrySet());

	        // Sort by Student fields (marks, then name, then rollNo)
	        list.sort(Comparator
	                .comparing((Map.Entry<Integer, Student> e) -> e.getValue().marks)
	                .thenComparing(e -> e.getValue().name)
	                .thenComparing(e -> e.getValue().rollNo));

	        System.out.println("Sorted map entries by student details:");
	        for (Map.Entry<Integer, Student> entry : list) {
	            System.out.println("Key: " + entry.getKey() + " → Value: " + entry.getValue());
	        }
	    }
	}

}
