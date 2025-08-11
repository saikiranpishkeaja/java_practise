package Task;

public abstract class DeliveryVehicle {

		String vehicleId;
		double fuelCapacity;
		
         public void start() {
		
        	 System.out.println("vehicle " +vehicleId);
         }
		public  void stop() {
		
			System.out.println("vehicle has reached at point " +fuelCapacity);
		}
		abstract double calculateDeliveryCost( double distance); 
 
}
 
  class Bike1 extends DeliveryVehicle {
	
	String vehicleId="TS9639A";
	double fuelCapacity=65.00;
	
	double calculateDeliveryCost(double distance) {
		return distance*2;
	}
	
	public void start() {
		
   	 System.out.println("VehicleId: "  +vehicleId);
    }
	public  void stop() {
	
		System.out.println("Vehicle has reach the point fuelCapacity: "+fuelCapacity);
	}
	
}
  
  
class Truck extends DeliveryVehicle {
	
	 String vehicleId="AP5369Y";
		double fuelCapacity=53.00;
		
	 double calculateDeliveryCost(double distance) {
		 return distance*5;
	 }
	
	 public void start() {
			
	   	 System.out.println("VehicleId: "+vehicleId);
	    }
		public  void stop() {
		
			System.out.println("Vehicle has reach the point fuelCapacity: "+fuelCapacity);
		}

	}
