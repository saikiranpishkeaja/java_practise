package chandra_Assigntask;

public class Remove_AllDuplicateString {

	public static void main(String[] args) {
		String str="Java Developer";
		String un=" ";
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(un.indexOf(ch)==-1) {
				un=un+str.charAt(i);
			}
			
		}
		System.out.println(un);

	}

}
