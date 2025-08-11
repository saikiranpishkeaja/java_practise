package Task;

public class Main_Book {

	public static void main(String[] args) {
		

		Book b= new Book();
		b.author();
		b.price();
		
		Member mem= new Member(123, "RAM");
		mem.name();
		mem.id();
		
		Librarian lib = new Librarian();
		lib.author();
		lib.multiple_Book();
		lib.setLibName("Ramanajay Shastri");
		System.out.println(lib.getLibName());
	}

}
