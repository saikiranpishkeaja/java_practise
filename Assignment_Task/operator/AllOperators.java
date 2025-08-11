package operator;

public class AllOperators {

	public static void main(String[] args) {
		int num1 = 12;  
        int num2 = 10;  

        
        int andResult = num1 & num2;
        System.out.println("Bitwise AND of " + num1 + " & " + num2 + " = " + andResult);
        

        int orResult = num1 | num2;
        System.out.println("Bitwise OR of " + num1 + " | " + num2 + " = " + orResult);
        System.out.println("Binary format: " + Integer.toBinaryString(orResult));
    

  
        int xorResult = num1 ^ num2;
        System.out.println("Bitwise XOR of " + num1 + " ^ " + num2 + " = " + xorResult);
     

        int notResult = ~num1;
        System.out.println("Bitwise NOT of " + num1 + " = " + notResult);
        System.out.println("Binary format: " + Integer.toBinaryString(notResult));
       

        int leftShift = num1 << 2;
        int rightShift = num1 >> 2;
        System.out.println(num1 + " << 2 = " + leftShift);  
        System.out.println(num1 + " >> 2 = " + rightShift); 
   

	}

}
