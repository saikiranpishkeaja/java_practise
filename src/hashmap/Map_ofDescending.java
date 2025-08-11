package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_ofDescending {

	    public static void main(String[] args) {

	        // Original map of students and their marks
	        Map<String, Integer> studentMap = new HashMap <>();
	        
	        studentMap.put("Arjun",4);
	        studentMap.put( "Maya",5);
	        studentMap.put( "kiran",3);
	        studentMap.put( "Anu",2);
	        

	        // Convert entries to a list
	        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(studentMap.entrySet());

	        // Sort only by key (name) in descending order
	        sortedList.sort((e1, e2) -> e1.getKey().compareTo(e2.getKey()));
	        sortedList.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));

	        // Print the result
	        System.out.println("Sorted Students by Name (Descending):");
	        for (Map.Entry<String, Integer> entry : sortedList) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

}
