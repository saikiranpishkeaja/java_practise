package hashmap;

import java.util.ArrayList;

// for only using sorted Key use Treemap

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Sorted {

	public static void main(String[] args) {
	
		HashMap<String,Integer> com= new HashMap<>();
		com.put("Ram", 1);
		com.put("sita", 4);
		com.put("hanuman", 3);
		com.put("laxman", 5);
		com.put("Ravan", 2);
		
		
		TreeMap<String,Integer> sortedlist= new TreeMap<>(com);
		
		for(Map.Entry<String,Integer> result: com.entrySet()) {
			System.out.println(result.getKey()+"----"+result.getValue() );
		}
		
		

	}

}
