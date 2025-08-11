package hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Map_ofAscending {

	    public static void main(String[] args) {

	        // Original map of students and their marks
	        Map<String, Integer> studentMap = Map.of(
	                "Arjun", 55,
	                "Anu", 96,
	                "Rakesh", 60,
	                "Bobby", 67
	        );

	        // Convert entries to a list
	        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(studentMap.entrySet());

	        // Sort only by key (name) in ascending order
	        sortedList.sort(Map.Entry.comparingByKey());

	        // Print the sorted result
	        System.out.println("Sorted Students Name (Ascending):");
	        for (Map.Entry<String, Integer> entry : sortedList) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

}
