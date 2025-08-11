package exceptionerror;

public class ExceptionThrowable {

	public static void processInput(String Input)throws InvalidInputException{
		try {
			int value=Integer.parseInt(Input);
			System.out.println("Prased input"+value);
		}
		catch(NumberFormatException e){
			throw new InvalidInputException("Invalid Exception..."+Input, e);
		}
	}
	public static void main(String[] args) {
		
    try {
    	processInput("Helloworld");
    }
    catch(InvalidInputException e){
    	System.out.println("success...");
    }
    
    
	}

}
