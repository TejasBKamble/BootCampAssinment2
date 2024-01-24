package Day2Assinment;

import java.util.Random;
import java.util.Scanner;

public class GuessingTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		Random random= new Random();
		int r=random.nextInt(101);
		
		System.out.println("R ="+r);
		
		
		for(int i=3;i>=1;i--)
		{
			System.out.println("Guess the Number");
			num=sc.nextInt();
			if(num<r)
			{
				System.out.println("Number Two Small "+(i-1)+" Attemts Left");
				
			}
			else if(num>r) {
				System.out.println("Number Two Large"+(i-1)+" Attemts Left");
			}
			else {
				System.out.println("Congradulation You Guess the Write Number "+ r);
				
				break;
			}
		}
		
		System.out.println("Good Bye");
		
	
	}

}
