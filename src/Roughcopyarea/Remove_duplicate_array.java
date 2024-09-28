package Roughcopyarea;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_duplicate_array {
	
	
	public static void main(String[] args) {
		
		
	 int[] a = {1,2,3,4,5,4,4,5,3,5,3,6,8,0};
	 
	 ArrayList<Integer> al = new ArrayList<>();
	 
	 for(int i =0 ; i<a.length ; i++) {
		 
		// while(!=-1) {
			 
			 for(int j = i+1; j<a.length; j++) {
				 if(a[i]==a[j]) {
					 a[j]=-1;
				 }
			 }
		
	 }
	
	for(int i =0 ; i<a.length; i++) {
		if(a[i] != -1) {
			al.add(a[i]);
		}
	}
	
	System.out.println(al);
	
	}

}
