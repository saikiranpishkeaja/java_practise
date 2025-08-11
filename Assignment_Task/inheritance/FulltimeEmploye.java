package inheritance;

public class FulltimeEmploye extends  PartTimeEmploye{

	FulltimeEmploye(String name, String empId) {
		super(name, empId);
		this.fullday=fullday;
	}

	int fullday;
	
	public int halfleave() {
		super.salary();
		return fullday;
	}
	
	
}
