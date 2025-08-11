package chandra_Assigntask;

public class Duplicate_character {

	public static void main(String[] args) {
		String str="Java Developer";
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length()-i-1;j++) {
				if(str[i]==str[j]) {
					
				}
			}
		}

	}

}
