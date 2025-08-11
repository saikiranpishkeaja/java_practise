package stack;

public class PatientPriority implements Comparable<PatientPriority> {
 
	    String name;
	    int priority;

	    public PatientPriority(String name, int priority) {
	        this.name = name;
	        this.priority = priority;
	    }

	    @Override
	    public int compareTo(PatientPriority other) {
	        return Integer.compare(this.priority, other.priority);
	    }
	    
	    // Descending
//	    public int compareTo(PatientPriority other) {
//	        return Integer.compare(other.priority, this.priority);  // Reversed
//	    }

	    @Override
	    public String toString() {
	        return name + " (Priority: " + priority + ")";
	    }
	

}
