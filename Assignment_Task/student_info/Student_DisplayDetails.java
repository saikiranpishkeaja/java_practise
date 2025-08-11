package student_info;

public class Student_DisplayDetails {
	
	     Student[] students;
	     int count;
	    final int total_Students;

	    public Student_DisplayDetails(int total_Students) {
	        this.total_Students = total_Students;
	        this.students = new Student[total_Students];
	        this.count =0;
	    }

	    public void addStudent(int id, String name, String address) {
	        if (count >= total_Students) {
	            System.out.println("Student list is full!");
	            return;
	        }
	        students[count++] = new Student(id, name, address);
	    }

	    public void displayAllStudents() {
	        System.out.println("----------########-----------");
	        System.out.println("---------------------------");
	        for (int i = 0; i < count; i++) {
	            System.out.println(students[i]);
	        }
	    }

	    public Student findStudent(int id) {
	        for (int i = 0; i < count; i++) {
	            if (students[i].getId() == id) {
	                return students[i];
	            }
	        }
	        return null;
	    }

	    public boolean updateStudent(int id, String newName, String newAddress) {
	        Student student = findStudent(id);
	        if (student != null) {
	            student.setName(newName);
	            student.setAddress(newAddress);
	            return true;
	        }
	        return false;
	    }
	    

	    public boolean deleteStudent(int id) {
	        for (int i = 0; i < count; i++) {
	            if (students[i].getId() == id) {
	                // Shift remaining students
	                for (int j = i; j < count - 1; j++) {
	                    students[j] = students[j + 1];
	                }
	                students[--count] = null;
	                return true;
	            }
	        }
	        return false;
	    }
	}
