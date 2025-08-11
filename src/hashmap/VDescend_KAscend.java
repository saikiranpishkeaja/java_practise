package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VDescend_KAscend {

	public static void main(String[] args) {
		
		 Map<String, Integer> studentMap = new HashMap<>();
	        studentMap.put("Arjun", 55);
	        studentMap.put("Anu", 96);
	        studentMap.put("Rakesh", 60);
	        studentMap.put("Bobby", 67);
	        studentMap.put("Arun", 55);  

	        
	        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(studentMap.entrySet());

	        // Sort: First by value (desc), then by key (asc)
	        sortedList.sort((e1, e2) -> {
	            int valueCompare = e2.getValue().compareTo(e1.getValue()); // value descending
	            if (valueCompare == 0) {
	                return e1.getKey().compareTo(e2.getKey()); // key ascending
	            } else {
	                return valueCompare;
	            }
	        });

	        
	        System.out.println("Sorted by values (desc) and Keys (asc):");
	        for (Map.Entry<String, Integer> entry : sortedList) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

	}

}
