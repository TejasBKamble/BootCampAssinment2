package Day2Assinment;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter a string: ");

	        String original = sc.nextLine();

	       
	        sc.close();

	   
	        String reversed = "";

	        
	        for (int i = original.length() - 1; i >= 0; i--) {
	           
	            reversed += original.charAt(i);
	        }

	        // Print the reversed string
	        System.out.println("Reversed string: " + reversed);

	}

}
