package Task;

public class Main_Delivery {

	public static void main(String[] args) {
		
		Bike1 bike = new Bike1();
		Truck tri= new Truck();
		
		System.out.println("----- STARTING THE VEHICLE OF BIKE -----");
		System.out.println( "Delivery Cost of Product: "+bike.calculateDeliveryCost(40));
		bike.start();
		bike.stop();
		System.out.println("===== STOPPED =====");
       System.out.println("-----######------");
       
       System.out.println(" -----STARTING THE VEHICLE OF TRUCK-----");
		System.out.println("Delivery Cost of Product: " +tri.calculateDeliveryCost(40));
		tri.start();
		tri.stop();
		System.out.println("===== STOPPED =====");
	}

}
