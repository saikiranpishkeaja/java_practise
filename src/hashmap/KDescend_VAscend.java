package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KDescend_VAscend {

	public static void main(String[] args) {
		
		 Map<String, Integer> studentMap = new HashMap<>();
	        studentMap.put("Arjun", 55);
	        studentMap.put("Anu", 96);
	        studentMap.put("Maya", 60);
	        studentMap.put("Bobby", 67);
	        studentMap.put("Arun", 55);  

	        
	        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(studentMap.entrySet());

	        // Sort: First by value (Asce), then by key (Desc)
	        sortedList.sort((e1, e2) -> {
	            int valueCompare = e1.getValue().compareTo(e2.getValue()); // value descending
	            if (valueCompare == 0) {
	                return e2.getKey().compareTo(e1.getKey()); // key ascending
	            } else {
	                return valueCompare;
	            }
	        });

	        // Print the sorted result
	        System.out.println("Sorted by Keys (desc) and values (asc):");
	        for (Map.Entry<String, Integer> entry : sortedList) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

	}

}
