package string.com;

public class StringReverseWord {

	public static void main(String[] args) {
		String str="Knowledge is Divine";
		String res=" ";
//		str=str.toUpperCase();
		
		String s1[]=str.split(" ");
		
		
		for(int i=s1.length-1;i>=0;i--) {
			res=res+s1[i]+" ";
		}
		
		System.out.println(res);
	}

}
