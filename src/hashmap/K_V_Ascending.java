package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class K_V_Ascending {

	public static void main(String[] args) {
		

		        Map<String, Integer> studentMap = new HashMap<>();
		        
		        studentMap.put("Arjun", 55);
		        studentMap.put("Anu", 96);
		        studentMap.put("Maya", 60);
		        studentMap.put("Bobby", 67);
		        studentMap.put("Arun", 55);

		        
		        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(studentMap.entrySet());

		        // Sort by key ASC, then value ASC
		        sortedList.sort((e1, e2) -> {
		            int keyCompare = e1.getKey().compareTo(e2.getKey()); // Key ascending
		            if (keyCompare == 0) {
		                return e1.getValue().compareTo(e2.getValue()); // Value ascending (if key same)
		            }
		            return keyCompare;
		        });

		       
		        System.out.println("Sorted by Name and Marks (both ascending):");
		        for (Map.Entry<String, Integer> entry : sortedList) {
		            System.out.println(entry.getKey() + " : " + entry.getValue());
	}

	}
}
