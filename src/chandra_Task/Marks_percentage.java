package chandra_Task;

public class Marks_percentage {

	public static void main(String[] args) {
		int total_marks=500;
		int maths=93;
		int physics=55;
		int chemistry=47;
		int english=89;
		int hindi=86;
		int result=maths+physics+chemistry+english+hindi;
		
		double report= (double) result/total_marks *100;
		
		char grade;
		if(report >= 90) {
			grade='A';
		}else if(report>=80) {
			grade='B';
		}else if(report >= 70) {
			grade='C';
		}else if(report >=60) {
			grade='D';
		}else if(report >= 40) {
			grade='E';
		}
		else {
			grade='F';
		}
		
		System.out.println("The total marks of students: " +result);
		System.out.println("Percentage of Student :" +report);
		System.out.println("Grade :" +grade);

	}

}
