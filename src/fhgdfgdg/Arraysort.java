package fhgdfgdg;

import java.lang.reflect.Array;

public class Arraysort {
	
		
	
	
	public static void main(String[] args) {
		
		int[] a= {12,21,12,12,32,43,343,345,454,3,3,7};
		int max =a[0];
		int min =a[0];
		int equ =a[0];

		
		for(int i = 0; i < a.length; i++) 
		
		{
			if (a[i]>max) {
				max =a[i];
				
			}
			if (a[i]<min){
				min=a[i];
			}
			
			if (a[i]==equ) {
				equ=a[i];
			}
			
		}
			
		System.out.println("max number"+max+"min number"+min +""+equ);	
		
	
	}
	

}
