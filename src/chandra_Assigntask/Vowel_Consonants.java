package chandra_Assigntask;

public class Vowel_Consonants {

	public static void main(String[] args) {
		String str="salaar movie";
		int vowel_cnt=0, constants_cnt=0;
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isLetter(ch)) {
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
					vowel_cnt++;
				}else {
					constants_cnt++;
				}
			}
			System.out.println("The character of Vowel:" +vowel_cnt+" and Constants: "+ constants_cnt);
		}
		

	}

}
