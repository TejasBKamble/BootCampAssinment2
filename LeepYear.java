package Day2Assinment;

import java.util.Scanner;

public class LeepYear {

	 public static String isLeapYear(int year) {
	        // Check if the year is valid
	        if (year < 1582) {
	            return "Invalid year";
	        }
	        // Check if the year is divisible by 4 and not 100 unless it is divisible by 400
	        else if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
	            return "Leap year";
	        }
	        // Otherwise, the year is not a leap year
	        else {
	            return "Not a leap year";
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter a year: ");

	       
	        int year = sc.nextInt();

	       
	        sc.close();

	        
	        String result = isLeapYear(year);
	        System.out.println(year + " is a " + result + ".");

	}

}
