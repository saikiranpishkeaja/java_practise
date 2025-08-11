package hashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExampleConcurrentHashMap {

static Map<Integer,String> com= new ConcurrentHashMap <>();
	
	public static void main(String[]args) {
	
	Thread writer= new Thread(()-> {
		for(int i=0;i<100;i++) {
			com.put(i,"value"+i);
		}
	});
	
	Thread reader = new Thread(()-> {
		for(int i=0;i<1000;i++) {
			String value=com.get(i);
			
			if(value !=null) {
				System.out.println("Read:"+i+ "--" +value);
			}
		}
	});
	
	writer.start();
	reader.start();
	
	try {
		writer.join();
		reader.join();
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("Successsfull Accessed");
	
	}


}
