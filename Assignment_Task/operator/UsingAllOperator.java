package operator;

public class UsingAllOperator {

	public static void main(String[] args) {
		
		int steps = 8500;
        int heartRate = 72;
        boolean didWorkout = true;
        int healthScore = 100;

        
        boolean isActiveDay = (steps > 7000) && didWorkout;
        boolean Attention = (heartRate > 100) || !didWorkout;

        
        int isActiveDayInt = Boolean.compare(isActiveDay, false);
        int needsAttentionInt = Boolean.compare(Attention, false);

        
        healthScore += isActiveDayInt * 10;
        healthScore -= (needsAttentionInt > 0 ? 1 : 0) * 15; 

        
        healthScore -= Math.max(needsAttentionInt, 0) * 15;

        // Output
        System.out.println("isActiveDay = " + isActiveDay);
        System.out.println("Attention = " + Attention);
        System.out.println("Updated healthScore = " + healthScore);
 

	}

}
