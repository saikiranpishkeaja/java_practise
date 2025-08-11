package methods;

public class Student {

	String name="Sai kiran";
	 int id=10;
	double salary=10000.0;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student student=(Student)obj;
		return this.id==student.id;
	}
	
	@Override
	public int hashCode() {
		return (int) (super.hashCode()+this.id+this.salary);
	}
	
	
	
}
