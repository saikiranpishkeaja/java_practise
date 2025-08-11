package singleton;

public class Counter {
	
	static int vote;
	static String member;
	
public Counter(int vote, String member) {
		Counter.vote= vote;
		Counter.member= member;
				
	}
	
	void election() {
		System.out.println("The Candidate elected more than votes :"+vote);
	}
    static void elected_member() {
    	System.out.println("The Candidate name :" +member);
    }
	public static void main(String[] args) {
		Counter cnt = new Counter(120,"Arjun Rao");
		cnt.election();
		Counter.elected_member();

	}

}
