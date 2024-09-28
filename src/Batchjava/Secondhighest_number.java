package Batchjava;

import java.util.Arrays;

public class Secondhighest_number {
	
	public static void main(String[] args) {
		
				        int a[] = {1, 2, 3, 1, 2, 1, 2, 1, 3, 1, 2};
		        int maxNumber = a[0];
		        int maxCount = 1;
		        int minNumber = a[0];
		        int minCount = Integer.MAX_VALUE;
		        int secondnumber =a[0];
		        int Secondnumbercount  =0;

		        for (int i = 0; i < a.length; i++) {
		            int current = a[i];
		            int checkCount = 1;

		            for (int j = i + 1; j < a.length; j++) {
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
		            
		            if(minNumber <  checkCount && checkCount<maxCount) {
		            	
		            	Secondnumbercount = checkCount;
		            	secondnumber = current;
		            	
		            	
		            	
		            }
		        }
		     
	              System.out.println("secondnumber"+Secondnumbercount);
	              System.out.println("secomd"+secondnumber);
	}
	


}
