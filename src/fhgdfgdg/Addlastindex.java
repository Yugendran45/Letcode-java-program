package fhgdfgdg;

import java.util.ArrayList;
import java.util.Arrays;

public class Addlastindex {
	
	public static void main(String[] args) {
		
		int[] a = {12,34,54,0,3,0,23,45,0,23,5,8,0,2,7,0};
		int count = 0;
		
		
		//output = {12,34,54,3,23,45,23,5,8,2,7,0,0,0,0,0}
		for(int i= 0; i<a.length;i++) {
			if(a[i]!=0) {
				a[count] =a[i];
				count++;
			}	
			
			}while (count < a.length) {
				a[count]=0;
				count++;
			}
		
	
	System.out.println(Arrays.toString(a));
	
	}}
