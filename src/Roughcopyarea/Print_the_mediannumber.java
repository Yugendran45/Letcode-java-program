package Roughcopyarea;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_the_mediannumber {

	public static void main(String[] args) {
		
		
		int[] a = {1,2};
		int[] b = {3,4};
		int count =0;
		
     int[] c = new int[a.length+b.length];
		
		for(int i=0 ; i<a.length ;i++) {
				  c[count]=a[i];
				 count++;
			
		}for(int j =0 ; j<b.length; j++) {

		c[count]= b[j];
		count++;
		}
		
		if(c.length%2 !=0) {
			count=c[c.length/2];
			System.out.println(count);
		}else {
			count= c[c.length/2];
	        count = count + c[count+1];
	        System.out.println(count);
		}
			
	}
	
}
