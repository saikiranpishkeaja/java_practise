package methods;

public class StudentReport {
	
	private String studentName;
	private String studentId;
	private int mathMarks;
	private int scienceMarks;
	private int englishMarks;
	private char grade;
	
	
	
	
	public StudentReport(String studentName, String studentId, int mathMarks, int scienceMarks, int englishMarks)
	{
		this.studentName = studentName;
		this.studentId = studentId;
		this.mathMarks = remarks(mathMarks);
		this.scienceMarks = remarks(scienceMarks);
		this.englishMarks = remarks(englishMarks);
		calculateGrade();
	}
	
	private int remarks(int marks) {
		return(marks>=0 && marks <=100)? marks : 0;
	}
	
	public void calculateGrade() {
		double average = calculateAverage();
		gradeCheck(average);
	}
	
	private void gradeCheck(double average) {
		if(average>=90) grade='A';
		else if(average>=75) grade='B';
		else if(average>=65) grade='C';
		else grade='D';
	}
	
	double calculateAverage() {
		return(mathMarks+scienceMarks+englishMarks)/3.0;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getStudentId() {
		return studentId;
	}



	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}



	public int getMathMarks() {
		return mathMarks;
	}



	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}



	public int getScienceMarks() {
		return scienceMarks;
	}



	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}



	public int getEnglishMarks() {
		return englishMarks;
	}



	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}



	public char getGrade() {
		return grade;
	}



	public void setGarde(char grade) {
		this.grade = grade;
	}


	public void studentdisplay() {
		System.out.println("The Student id " +studentId+ "Student name " +studentName+ "Mathmarks" +mathMarks+ 
				" Sciencemarks" +scienceMarks+ "Englishmarks" +englishMarks);
	}
	
	

	public static void main(String[] args) {
		
		StudentReport stu = new StudentReport();
		stu.studentdisplay();
		

	}

}
