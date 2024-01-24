package Day2Assinment;

import java.util.Random;

public class RandomArraySumAVG {
	
	static int sum=0;
	static double avg=0.0;

	public static void main(String[] args) {	
		
       Random random = new Random();
        
        
        int[] array = new int[75];
        
      
        for (int i = 0; i < array.length; i++) {
            // Generate a random integer between 0 and 100 
            array[i] = random.nextInt(101);
            
            sum =sum+array[i];
        }
        
        
        for (int num : array) {
            System.out.print(num + " ");
          
        }
        
        avg=(double)sum/array.length;
        System.out.println("\n Sum is ="+ sum);
        
        System.out.println("\n Avg is ="+ avg);

	}

}
