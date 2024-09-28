package Arraytypes;

import java.util.ArrayList;

public class Print_comman_numberinarray {

	public static void main(String[] args) {
	
		//print comman number
		
		int[] a = {1,6,2,3,4,5};
		int[] b = {1,6,7,8,9,10};
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		for(int i =0; i<a.length; i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					al.add(a[i]);
					break;
				}
			}
		}
           System.out.println(al);      
	} 
}
