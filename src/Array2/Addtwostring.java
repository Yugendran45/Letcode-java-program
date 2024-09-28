package Array2;

import java.util.Arrays;

public class Addtwostring {
 
	
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {5,6,7};
		int[] c = new int[a.length+b.length];
		
		int p=0;
 
		for (int i =0; i<a.length; i++) {
			
			c[p]=a[i];
			p++;
					
			
		}
		
		for(int i=0; i<b.length;i++) {
			c[p]=b[i];
			p++;
		}
		
		/*
		 * for(int i:c) { System.out.println(i);
		 * 
		 * }
		 */
		 System.out.println(Arrays.toString(c));

		
		
 	}

}
