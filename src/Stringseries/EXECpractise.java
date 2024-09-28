package Stringseries;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class EXECpractise {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6};
		int[] b= {1,3,4,5,6,5};
	 
	    int[] arr = new int[a.length+b.length];
	    int count =0;
	    
	    for(int i =0;i<a.length;i++) {
	    	arr[i] =a[i];
	    	//count++;
	    }
	    
	   // System.out.println(Arrays.toString(arr));
	    
	    for(int j=0; j<b.length;j++) {
	    	arr[a.length+j] = b[j];
	    	//count++;
	    }
		
		
	     System.out.println(Arrays.toString(arr));	
	}
}


