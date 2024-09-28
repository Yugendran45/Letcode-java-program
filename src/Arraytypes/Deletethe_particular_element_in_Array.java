package Arraytypes;

import java.util.ArrayList;

public class Deletethe_particular_element_in_Array {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		int target = 7;
		
		for(int i =0 ; i<a.length; i++) {

			if(a[i]!=target) {
				al.add(a[i]);
		
				
				
			}
			
		}
	System.out.println(al);	
	}

}
