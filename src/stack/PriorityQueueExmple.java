package stack;

import java.util.PriorityQueue;

public class PriorityQueueExmple {

    public static void main(String[] args) {
        PriorityQueue<PatientPriority> com = new PriorityQueue<>();

        com.offer(new PatientPriority("Arjun", 3));
        com.offer(new PatientPriority("Maya", 2));
        com.offer(new PatientPriority("Kiran", 5));
        com.offer(new PatientPriority("Anu", 4));
        com.offer(new PatientPriority("ram", 1));

        while (!com.isEmpty()) {
        	PatientPriority next = com.poll();
            System.out.println("Treating: " + next);

            
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }

        System.out.println("All patients treated.");
    }
}
