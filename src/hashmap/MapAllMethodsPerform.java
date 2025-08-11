package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapAllMethodsPerform {

	    public static void main(String[] args) {
	    	
	        // Create a HashMap
	        Map<String, Integer> map = new HashMap<>();

	        // Adding key-value pairs using put()
	        map.put("Apple", 10);
	        map.put("Banana", 20);
	        map.put("Mango", 30);

	        // Displaying the map
	        System.out.println("Map: " + map);

	        // Get value for a key
	        System.out.println("Value for 'Banana': " + map.get("Banana"));

	        // Remove a key
	        map.remove("Apple");
	        System.out.println("After removing 'Apple': " + map);

	        // Check if a key exists
	        System.out.println("Contains 'Mango'? " + map.containsKey("Mango"));

	        // Check if a value exists
	        System.out.println("Contains value 30? " + map.containsValue(30));

	        // Iterating using keySet()
	        System.out.println("Keys:");
	        for (String key : map.keySet()) {
	            System.out.println(key);
	        }

	        // Iterating using entrySet()
	        System.out.println("\nEntries:");
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }

	        // Size of map
	        System.out.println("\nSize of map: " + map.size());

	        // Clear map
	        map.clear();
	        System.out.println("Map after clearing: " + map);
	    }
	    
}
