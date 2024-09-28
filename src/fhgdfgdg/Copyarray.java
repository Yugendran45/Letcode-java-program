package fhgdfgdg;

import java.util.Arrays;

public class Copyarray {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40};
	    int l=	a.length;
		int b[] = new int[l];
		int j=0;
		
		for(int i =0; i <a.length; i++) {
			
			b[j]=a[i];
			j++;
		}
			
		System.out.println(Arrays.toString(b));

}
}