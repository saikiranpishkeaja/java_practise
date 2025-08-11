package Task;

interface Borrowable {
	int bookPrice = 500;
	String authorName = "Sri sri";
	void author();
	void price();
	static void multiple_Book() {
		System.out.println("It depend on your fascinating");
	}
}

abstract class Person {
	
	private int memberShipId;
	private String name;
	
	public Person(int memberShipId, String name ) {
		this.setMemberShipId(0321);
		this.setName("ARJUN ");
	}
	abstract void name();
	abstract void id();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemberShipId() {
		return memberShipId;
	}
	public void setMemberShipId(int memberShipId) {
		this.memberShipId = memberShipId;
	}
}
	
abstract class Library{
	private String libName;
	
		abstract void libraryName();
		static void moralstories() {
			System.out.println("Inspiration of moral stories");
		}
		public String getLibName() {
			return libName;
		}
		public void setLibName(String libName) {
			this.libName = libName;
		}
	}


public class Book implements Borrowable{
  public void author(){
	   System.out.println("The Author of Book : " +authorName);
   }
  public void price() {
	  System.out.println("The price of the Book: " +bookPrice);
  }
}

class Member extends Person{
	
	
	public Member(int memberShipId, String name) {
		super(memberShipId, name);
		
	}
	void name() {
		System.out.println("The Name of Person who took book :" +getName());
	}
	void id() {
		System.out.println("The membership Id : "+getMemberShipId());
	}

	
}

class Librarian extends Library implements Borrowable {
	
	public  void multiple_Book() {
		 System.out.println("Their are multiple Books in Library regarding MAHABHARATHAM ..etc");
	 }
	
	void libraryName() {
		System.out.println("Name of the Library :");
	}

	@Override
	public void author() {
		
		System.out.println("Their are difference types of Author according the books");
	}

	@Override
	public void price() {
		System.out.println("Differences price Each book");
		
	}
}
