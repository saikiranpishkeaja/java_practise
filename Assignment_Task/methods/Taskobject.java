package methods;

public class Taskobject {
	String bookname;
	
	public Taskobject(String bookname) {
		this.bookname=bookname;
	}

	public void display() {
		System.out.println("Bookname :"+bookname);
	}

	public static void main(String[] args) {
		Taskobject obj= new Taskobject("Ramayanam");
		obj.display();
		Taskobject ab= new Taskobject("mahabhrartham");
		ab.display();
	
	}

}
