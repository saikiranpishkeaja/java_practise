package insurance.project.com;

public class Admin {

	
	String name;
	String policy;
	int id;
	int policycnt;
	
	public Admin(String name, String policy, int id, int policycnt) {
		super();
		this.name = name;
		this.policy = policy;
		this.id = id;
		this.policycnt= policycnt;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", policy=" + policy + ", id=" + id + ", policycnt=" + policycnt + "]";
	}

	
	
	
	
}
