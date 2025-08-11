package exceptionerror;

public class ExceptionDeclaration {
 @SuppressWarnings("finally")
public static void main(String[]args) {
	 Exception myException= null;
	 try {
		 System.out.println("inside try block");
		 throw new RuntimeException("Exception in try block" );
	 }
	 catch(Exception e){
		 myException = e;
		 System.out.println("catch exceution...");
	 }
	 finally {
		 System.out.println("inside finallly block");
		 try {
			 throw new RuntimeException("Exception in try block");
		 }catch(Exception fe){
			 if(myException != null) {
				 myException.addSuppressed(fe);
				 System.out.println("finally block"+fe.getMessage());
//				throw new RuntimeException("Exception is finally block", myException);
			 }else {
				 throw fe;
			 }
		 }
	 }
 }
}
