package Day2Assinment;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.*;

public class RandumArrayGeneration {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

        Random rand = new Random();

              int size;
     
        int attempts = 0;
       
        boolean valid = false;
       
        do {
           
            System.out.println("Enter the size of the array (between 1 and 10):");
            
            size = sc.nextInt();

            if (size >= 1 && size <= 10) {
                
                valid = true;
            } else {
                
                attempts++;
            
                System.out.println("Invalid input. Please try again.");
            }
        } while (!valid && attempts < 3); 
        
        if (valid) {
        	
            double[] array = new double[size];

            // Use a for loop to fill the array with random numbers between 100.0 and 500.0
            for (int i = 0; i < size; i++) {
                // Generate a random number between 0.0 and 1.0
                double random = rand.nextDouble();

                // Scale and shift the random number to the desired range
                double number = 100.0 + random * 400.0;
                
                array[i] = number;
            }
         
            System.out.println("The array is:");

            for (double element : array) {
                System.out.println(element);
            }
        } 
        else {
            
            System.out.println("Array size entered is not correct.");
        }
        
        sc.close();
	}

}
