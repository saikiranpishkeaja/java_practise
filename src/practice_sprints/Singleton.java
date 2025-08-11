package practice_sprints;

public class Singleton {
	
	private static Singleton instance;
	private static String email;
	private static String user;
	private static String password;

	
	private Singleton() {
		Singleton.setEmail("arjunsai23@gmail.com");
		Singleton.setUser("arjunsai");
		Singleton.password= "Ty12347";
	}
	
	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Singleton.password = "1235667";
	}
	
	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		Singleton.user = "arjunsai";
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Singleton.email = "arjunsai23@gmail.com";
	}

	 static Singleton getInstance() {
		if(instance == null) {
			System.out.println("It allow");
			instance = new Singleton();
			System.out.println("Singleton Pattern");
		}
		return instance;
	}
	 
	 void info() {
		 System.out.println("It allow the access");
	 }
	 
	 
	public static void main(String[] args) {
		
      Singleton sin= Singleton.getInstance();
      sin.info();
      Singleton.getInstance();
      System.out.println("The password :" +Singleton.getPassword());
      System.out.println("The Userf anme of member" +Singleton.getUser());
      System.out.println("memeber Email :" +Singleton.getEmail());
      
	}
}
