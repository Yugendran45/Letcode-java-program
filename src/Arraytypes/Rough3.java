package Arraytypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rough3 {
	
	public static void main(String[] args) {
    
		int[] a = {1,0,3,0,5,0,7,0,8,0};
		
	//	output = {1,3,5,7,8,0,0,0,0,0};
		
		int count = 0;
		
		for(int i =0 ; i<a.length; i++) {
			
			if(a[i]!= 0) {
				a[count]=a[i];
				count++;
			}
		}
		
		while(count < a.length) {
			a[count]=0;
			count++;
		}
		System.out.println(Arrays.toString(a));
	}}
