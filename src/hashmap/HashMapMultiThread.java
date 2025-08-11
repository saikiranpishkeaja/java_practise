package hashmap;

//import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapMultiThread {

	static Map<Integer, String> com= new ConcurrentHashMap<>();
	
	public static void main(String[]args)throws InterruptedException{
	
		Thread t1= new Thread(()-> addRecords(0,1000));
		Thread t2= new Thread(()-> addRecords(1000,3000));
		Thread t3= new Thread(()-> addRecords(1000,2000));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join(500);
		t3.join(50000);;
		
		System.out.println("Size of Map: "+com.size());
		
	}
	
	static void addRecords(int start, int end) {
		for(int i=start;i<end;i++) {
			com.put(i,"value" +i);
		}
	}
	
	
		
	
}
