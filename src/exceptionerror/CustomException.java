package exceptionerror;


class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super("run");
	}
}

public class CustomException {

	public static void main(String[] args){
		try {
			registerVoter(15);
			System.out.println();
		}
		catch(InvalidAgeException e){
			System.out.println("error" + e.getMessage());
		}

	}

	public static void registerVoter(int age)throws InvalidAgeException {
		if(age < 18)
		{
			System.out.println("Allegable for vote" + age);
		}else {
			throw new InvalidAgeException("not ----");
		}
	}

	
	

}
