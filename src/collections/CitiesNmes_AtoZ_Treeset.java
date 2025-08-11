package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CitiesNmes_AtoZ_Treeset {

	
	    public static void main(String[] args) {
	       
	    	
//	        Set<String> cities = new TreeSet<>(new Comparator<String>() {
//	           
//	            public int compare(String s1, String s2) {
//	                if (s1.length() != s2.length()) {
//	                    return Integer.compare(s1.length(), s2.length()); // Sort by length
//	                } else {
//	                    return s1.compareTo(s2); // Alphabetically if lengths are equal
//	                }
//	            }
//	        });

	    	
	    	//lambda expression
//	    	Set<String> cities = new TreeSet<>((s1, s2) -> {
//	    	    int lenCompare = Integer.compare(s1.length(), s2.length());
//	    	    return (lenCompare != 0) ? lenCompare : s1.compareTo(s2);
//	    	});
	    	
	    	
	    	// Comparator.comparing with Chaining
	    	Set<String> cities = new TreeSet<>(
	    		    Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())
	    		);
	    	
	    	
	    	
	        Collections.addAll(cities, "Hyderabd", "Chennai", "Mumbai", "Noida", "Bangalore", "Indore", "Delhi");

	        
	        for (String city : cities) {
	            System.out.println(city);
	        }
	    }
	}
