package methods;

class Demo{
	private String name;
	private int age;
	
	public Demo(String string, int i) {
		this.name=name;
		this.age=age;
	}
	



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
 
}

 

public class Encapsulation {
	
	 public static void main (String[]args) {
		 Demo d1= new Demo("Arjun ", 32);
		 System.out.println(d1.getName());
		 System.out.println(d1.getAge());
		 d1.setAge(32);
		 d1.setName("ARJUN");
		 
		 System.out.println("NAME :"+d1.getName());
		 System.out.println("AGE :"+d1.getAge());
		 
		 
	 }
}
