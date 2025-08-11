package chandra_Task;

public class Students_percentage {

	public static void main(String[] args) {
		 int totalmarks=100;
		 int result=60;
		 
		 int percentage=(totalmarks/result) * 100;
		 
		 if(percentage >=60) {
			 System.out.println("DIVISON 1");
		 }else if(percentage >=45) {
			 System.out.println("DIVISION 2");
		 }else if(percentage >=30) {
			 System.out.println("DIVISION 3");
		 }else {
			 System.out.println("FAIL");
		 }

	}

}
