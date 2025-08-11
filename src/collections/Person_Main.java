package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person_Main {

	public static void main(String[] args) {
		
		 List<Person> people = new ArrayList<>();

	        people.add(new Person("Alice", 30));
	        people.add(new Person(null, 40));
	        people.add(new Person("Bob", 25));
	        people.add(new Person("Alice", 22));
	        people.add(new Person(null, 28));

	        // Custom comparator
	        Comparator<Person> personComparator = new Comparator<Person>() {
	            @Override
	            public int compare(Person p1, Person p2) {
	                // Compare names, placing nulls last
	                int nameCompare = Comparator
	                        .nullsLast(String::compareTo)
	                        .compare(p1.name, p2.name);

	                if (nameCompare != 0) {
	                    return nameCompare;
	                }

	                // If names are equal, compare age ascending
	                return Integer.compare(p1.age, p2.age);
	            }
	        };
	        
	        
//	        Comparator<Person> comparator = Comparator
//	                .comparing(p -> p.name, Comparator.nullsLast(String::compareTo))
//	                .thenComparingInt(p -> p.age)reversed();
//
//	        // Sort the list
//	        people.sort(comparator);
//
//	        // Print sorted list
//	        people.forEach(System.out::println);
	        
	        
	        

	        // Sort the list
	        Collections.sort(people, personComparator);

	        // Output the sorted list
	        for (Person p : people) {
	            System.out.println(p);
	        }
	    }

}
