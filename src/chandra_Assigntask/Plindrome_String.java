package chandra_Assigntask;

import java.util.Scanner;

public class Plindrome_String {

	public static void main(String[] args) {
		
		String str = "madam";
		
		String reverse= new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse);
		
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		


		 
//		 if(isPalindrome(str)) {
//			 System.out.println("Palindrome");
//		 }else {
//			 System.out.println("Not palindrome");
//		 }
//	}
//	
//	public static boolean isPalindrome(String str) {
////		 str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//		str= str.toLowerCase();
//		
//		int length=str.length();
//		
//		for (int i = 0; i < length / 2; i++) {
//            if (str.charAt(i) != str.charAt(length - 1 - i)) {
//                return false; 
//            }
//        }
//        return true;
//		
//	}

       }
   }
