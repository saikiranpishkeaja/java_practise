package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hashmap_descen {

	public static void main(String[] args) {
				
				HashMap<String,Integer> com= new HashMap<>();
				com.put("Ram", 1);
				com.put("sita",4);
				com.put("hanuman",3);
				com.put("laxman",5);
				com.put("ravan",2); 
				
				System.out.println("Updating...."+com);
				
				com.put("Ram", 7);
				com.remove("ravan");
	
				
				
				List<Map.Entry<String,Integer>> sortedlist= new ArrayList<>(com.entrySet());
				
				sortedlist.sort(Map.Entry.<String,Integer>comparingByValue());
				
				
				for(Map.Entry<String,Integer> result :sortedlist) {
					System.out.println(result.getKey()+"--->"+result.getValue());
				}

	}

}
