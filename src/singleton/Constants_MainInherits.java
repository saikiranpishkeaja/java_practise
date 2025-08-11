package singleton;

public class Constants_MainInherits {

	public static void main(String[] args) {
//		Varying va = new Varying();
//		va.tour();
		
		Constants.tour();

	}

}

final class Constants {
	 static void tour() {
		 System.out.println("GO GOA GOING");
		 
	 }
}

class Varying extends Constants { 
	
}
