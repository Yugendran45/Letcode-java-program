package Roughcopyarea;

import java.util.Arrays;

public class Tryingmode {

	public static void main(String[] args) {
		
	
		
		  
		        int a[] = {1, 2, 3, 1, 2, 1, 2, 1, 3, 1, 2};
		        int maxNumber = a[0];
		        int maxCount = 0; // Initialize to 0
		        int minNumber = a[0];
		        int minCount = Integer.MAX_VALUE;
		        int secondNumber = a[0]; // Renamed to follow Java naming conventions
		        int secondNumberCount = 0; // Initialize to 0

		        for (int i = 0; i < a.length; i++) {
		            int current = a[i];
		            int checkCount = 0;

		            for (int j = 0; j < a.length; j++) { // Fixed the inner loop
		                if (a[j] == current) {
		                    checkCount++;
		                }
		            }

		            if (checkCount > maxCount) {
		                maxCount = checkCount;
		                maxNumber = current;
		            }

		            if (checkCount < minCount) {
		                minCount = checkCount;
		                minNumber = current;
		            }
		            
		            if (checkCount < maxCount && checkCount > secondNumberCount) { // Fixed condition
		                secondNumberCount = checkCount;
		                secondNumber = current;
		            }
		        }
		     
		        System.out.println("Most frequent number: " + maxNumber + ", frequency: " + maxCount);
		        System.out.println("Least frequent number: " + minNumber + ", frequency: " + minCount);
		        System.out.println("Second most frequent number: " + secondNumber + ", frequency: " + secondNumberCount);
		    }
		

		 
	

}
