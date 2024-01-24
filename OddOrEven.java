package Day2Assinment;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner sc= new Scanner(System.in);
	      System.out.printf ("Enter a Number");
	      
	      num=sc.nextInt();
	      
	      if(num%2==0)
	      {
	    	  System.out.println("Number is Even "+ num);
	      }
	      else {System.out.println("Number is Odd "+ num);}

	}

}
