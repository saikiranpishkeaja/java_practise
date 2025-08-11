package methods;

public class Task1 {
	private String title;
	private String author;
	private int isbn;
	private boolean issued;
	

	public Task1(String title,String author,int isbn, boolean issued) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.issued=issued;
	}


	public void displayinfo() {
		System.out.println("The story of "+ title +" author by "+ author+" isbn no "+isbn);
	}
	
	public void issuebook() {
        if (issued!=true) {
           
            System.out.println("Book issued.");
        } else {
            System.out.println("Book is not issued.");
        }
    }
    
	
    public void returnbook() {
        if (issued!=false) {
            System.out.println("Book return.");
        } else {
            System.out.println("Book was not return.");
        }
    }
    
    public String gettitle() {
        return title;
    }
    
    public String getauthor() {
        return author;
    }
    
    public int getisbn() {
    	return isbn;
    }
    
    public boolean getissued() {
    	return issued;
    }

	public static void main(String[] args) {
		
     Task1 t1 = new Task1("Harrypotter","Harryt", 7542 ,true);

     t1.displayinfo();
     t1.issuebook();
     t1.returnbook();
     System.out.println("------------");
     
     Task1 t2 = new Task1("pirvates thinks","carol wiscoin", 325 , false);

     t2.displayinfo();
     t2.issuebook();
     t2.returnbook();
     
     
	}

}
