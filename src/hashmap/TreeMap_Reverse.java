package hashmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Reverse {

	public static void main(String[]args) {
		
		//
		Map<String,Integer> compound= new TreeMap<>();
		compound.put("Arjun",210);
		compound.put("Maya",121);
		compound.put("Ramu",209);
		compound.put("Kiran",321);
		
		
		List<Map.Entry<String,Integer>> fixed = new ArrayList<>(compound.entrySet());
		
		fixed.sort(Map.Entry.comparingByValue());
		
		
		
		// 
		compound.forEach((key,value)-> System.out.println(key+"----"+value));
		
	}
}
