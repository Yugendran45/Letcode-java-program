package Arraytypes;

import java.util.Arrays;

public class print_two_arrayand_sort {
	
	public static void main(String[] args) {
		int[] a ={10,20,30,40,50};
		int[] b = {5,10,15,20};
		// output = {5,10,15,20,20,30,40,50}
		int[] al = new int[a.length+b.length];
		for(int i = 0; i<a.length; i++) {
			al[i]=a[i];
		}
			for(int j= 0; j<b.length; j++) {
			  al[a.length+j]=b[j];
		
		}
			
			Arrays.sort(al);
	
	System.out.println(Arrays.toString(al));
	}

}
