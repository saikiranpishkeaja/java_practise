package hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Map_ofDetails {

	    public static void main(String[] args) {

	        // Original map of students and their marks
	        Map<String, Integer> studentMap = Map.of(
	                "Arjun", 85,
	                "Anu", 96,
	                "Rakesh", 60,
	                "Bobby", 67
	        );

	        
	        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(studentMap.entrySet());

	        // Sort by marks (descending), then by name (ascending)
	        sortedList.sort((e1, e2) -> {
	            int cmp = e2.getValue().compareTo(e1.getValue()); // Descending marks
	            if (cmp == 0) return e1.getKey().compareTo(e2.getKey()); // Ascending name
	            return cmp;
	        });

	        // Print sorted entries
	        System.out.println("Sorted Students:");
	        for (Map.Entry<String, Integer> entry : sortedList) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

}
