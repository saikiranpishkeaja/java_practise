package methods;

public class StudentDetails {

	private String studentName; 
	private String studentId; 
	private int mathMarks;   
	private int scienceMarks;  
	private int englishMarks;  
	private char grade;  
	
	public StudentDetails(String studentName, String studentId, int mathMarks, int scienceMarks, int englishMarks){   
		this.studentName = studentName;     
		this.studentId = studentId;    
		this.mathMarks = mathMarks;   
		this.scienceMarks = scienceMarks; 
		this.englishMarks = englishMarks;   
		} 
	
	public void update_Marks(String subject, int newMarks) throws Exception {   
		if (newMarks < 0 || newMarks > 100) {         
			throw new IllegalArgumentException("Marks should be between 0 and 100.");   
			}
		
		switch (subject.toLowerCase()) {     
		case "mathmarks":      
			this.mathMarks = newMarks;        
			break;        
			case "sciencemarks":      
				this.scienceMarks = newMarks;      
				break;        
				case "englishmarks":      
					this.englishMarks = newMarks;  
					break;         
					default:           
						throw new IllegalArgumentException("Invalid subject: " + subject);   
						}  
		}  
	
	public int getScienceMarks() {    
		return scienceMarks;  
		}
	
	public void setScienceMarks(int scienceMarks) {   
		if (scienceMarks >= 0 && scienceMarks <= 100) {           
			this.scienceMarks = scienceMarks;      
			}
		else { 
			System.out.println("Invalid science marks. Must be between 0 and 100.");    
			}
		}
	public int getEnglishMarks() { 
		return englishMarks; 
		} 
	public void setEnglishMarks(int englishMarks) { 
		if (englishMarks >= 0 && englishMarks <= 100) { // Added validation
			this.englishMarks = englishMarks;   
			} 
		else {      
			System.out.println("Invalid English marks. Must be between 0 and 100."); 
			}
		}   
	public int getMathMarks() {    
		return mathMarks;  
		} 
	
	public void setMathMarks(int mathMarks) { 
		if (mathMarks >= 0 && mathMarks <= 100) { // Added validation 
			this.mathMarks = mathMarks;   
			}
		else { 
			System.out.println("Invalid Math marks. Must be between 0 and 100.");    
			}
		} 
	
	public String getStudentId() {
		return studentId;  
		}
	public void setStudentId(String studentId) { 
		this.studentId = studentId;   
		}
	public String getStudentName() {
		return studentName; 
		}
	public void setStudentName(String studentName) { 
		this.studentName = studentName;   
		}
	public double calculateAverage(){
		return (double) (mathMarks + scienceMarks + englishMarks) /3;
		}
	public char getGrade(){  
		double average = calculateAverage();
		if(average>=90){
			return 'A';
			}
		else if (average>=80 ) {
			return 'B'; 
			}
		else if(average>=70 ){   
			return 'C'; 
			}
		else if (average>=60 ) {
			return 'D'; 
			}
		else{ 
			return 'F';  
			}
		}
	
	public static void main(String[] args) throws Exception {
		StudentDetails s1 = new StudentDetails("SAIKIRAN","20PA1A",74,57,85);
		System.out.println("Initial Grade: " + s1.getGrade()); 
		s1.update_Marks("mathmarks",80);
		s1.setStudentName("Saikiran ARJUN");      
		s1.setStudentId("20P208"); 
		s1.setEnglishMarks(91);
		s1.setMathMarks(97);
		s1.setScienceMarks(94);   
		System.out.println("----------#################-----------------");
		System.out.println("Student name: "+s1.getStudentName());
		System.out.println("Student ID: "+s1.getStudentId());   
		System.out.println("English Marks: "+s1.getEnglishMarks());   
		System.out.println("Maths Marks: "+s1.getMathMarks());  
		System.out.println("Science Marks: "+s1.getScienceMarks());   
		System.out.println("Percentage: "+s1.calculateAverage()+"%");  
		System.out.println("Grade: "+s1.getGrade());  
		   
		}

		
	}

