package operator;

public class FitnessCheck {

	public static void main(String[] args) {
		
		   int steps = 8500;
	        int heartRate = 72;
	        boolean didWorkout = true;
	        int healthScore = 100;

	       
	        boolean isActiveDay = (steps > 7000) && didWorkout;
	        
	        boolean Attention = (heartRate > 100) || !didWorkout;

	        if (isActiveDay) {
	            healthScore += 10;  
	        }
	        if (Attention) {
	            healthScore -= 15; 
	        }

	        // Print results
	        System.out.println(" Active Day? " + isActiveDay);
	        System.out.println(" Attention: " + Attention);
	        System.out.println("Updated Health Score: " + healthScore);
	   
	}

}
