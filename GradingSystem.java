package Day2Assinment;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc= new Scanner(System.in);
	      System.out.printf ("Enter a Grade Out of 100 ");
	      
	      num=sc.nextInt();
	      
	     if(num >=90 && num<=100)
	     {
	    	 System.out.printf (" A ");
	     }
	     else if(num >=80  && num <= 89) {
	    	 System.out.printf (" B ");
	     }
	     else if(num >=70 && num <=79) {
	    	 System.out.printf (" C ");
	     }
	     else if(num >=60 && num <=69) {
	    	 System.out.printf (" D ");
	     }
	     else
	     {
	    	 System.out.printf (" F ");
	    	 
	     }
	      
	      

	}

}
