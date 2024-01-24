package Day2Assinment;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
	      System.out.printf ("Enter a Number");
	      
	      num=sc.nextInt();
	      
	      for(int i=1;i<=10;i++)
	      {
	    	  System.out.println(num+" X "+i+" = "+num*i);
	      }	      

	}

}
