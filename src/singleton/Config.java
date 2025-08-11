package singleton;

public class Config {
	
	final String bank_AppName= "Gpay";
	
//	public Config(String bank_AppName) {
//		this.bank_AppName= bank_AppName;
//	}
	
	void modifying() {
		System.out.println("Manipulated the App Name:"+ bank_AppName);
	}

	public static void main(String[] args) {
		
     Config con= new Config();
     
    System.out.println(con.bank_AppName);
      con.modifying();
      
      
	}

}
