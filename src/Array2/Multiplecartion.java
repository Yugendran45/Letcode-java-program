package Array2;

import java.util.Scanner;

public class Multiplecartion {
	
	
	  	 
	
	
	public static void main(String[] args) {
		
		
		/*
		 * Scanner s = new Scanner(System.in); int value = s.nextByte();
		 * System.out.println("Enter the number"+value);
		 */ 
		 boolean status ;
         
		 int n = 15;
		 
		 n=n%4;
		
		
		if(n==0) {
			status= false;
			
			
		}
		n=n%4;
		 
		if(n ==0) {
			
			status =true;
			
			
		}else {
			status =false;
		}
		
		/*int n = 41;
		
		n=n%4;
		
		if(n==0) {
			System.out.println("its fine ");
		}else
			System.out.println("its not fine");
		 
		
		System.out.println(n);
				
	}*/
		
		System.out.println(status);
		

}
}