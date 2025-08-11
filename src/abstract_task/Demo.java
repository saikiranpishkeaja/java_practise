package abstract_task;


abstract class Phone {
	
	 public void music() {
		 System.out.println("palying the music...");
	 }
	 
	 public abstract void gamingApp();
	 public abstract void tradeMarket();
	 
	 public static void chat() {
		 System.out.println("chatting ");
	 }
	 
}

abstract class Laptop extends Phone{
	
	public void gamingApp(){
		System.out.println("Building the app");
	}
	
	public abstract void tradeMarket();
}
public class Demo extends Laptop {
	
	public void tradeMarket() {
		System.out.println("up's and down's");
	}

	public static void main(String[] args) {
		Demo.chat();
		
         Phone ph= new Demo();
        	 ph.music();
        	 ph.tradeMarket();
        	 ph.gamingApp();
//             ph.chat();
        	
	}

}
