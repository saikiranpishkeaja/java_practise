package sneha_task;

public class First_LastChararcter {

	public static void main(String[] args) {
		String str="Knowledge is Divine";
		char ch='e';
		int cnt=0;
		String word="e";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				System.out.println(i+",");
				cnt++;
			}
		}
		System.out.println("The count of word:"+cnt);
		
		String s1[]=str.split(" ");
		
		for(int j=0;j<s1.length;j++) {
			if(s1[j]==word) {
				System.out.println("The total word :"+s1[j].length());
			}
		}
		
		

	}

}
