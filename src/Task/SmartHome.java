package Task;

public class SmartHome {
	
	class Lights{
		void turnOn() {
			System.out.println("The light turned ON");
		}
	}
	
	
	static class WifiSettings {
		static void connect() {
			System.out.println("WiFi connected to SmartHome network");
		}
	}

	
	void securityCheck() {
	class Camera {
		void scan() {
			System.out.println("Camera scanning the area");
		}
	}
	Camera cam = new Camera();
	cam.scan();
	}
	
	
	interface temperature{
		void climateControl();
	}
	
	void autoAdjust() {
		temperature temp= new temperature(){
		
	    public void climateControl() {
		   System.out.println("Adjusting room temperature automatically");
	   }
		};
		
		temp.climateControl();
	}
	

	public static void main(String[] args) {
		
     SmartHome hme= new SmartHome();
     SmartHome.Lights lig = hme.new Lights();
     lig.turnOn();
     
     SmartHome.WifiSettings hmewifi = new SmartHome.WifiSettings();
     hmewifi.connect();
     
     hme.securityCheck();
     
     hme.autoAdjust();
     
     
	}

}
