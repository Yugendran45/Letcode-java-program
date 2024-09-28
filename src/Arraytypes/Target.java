package Arraytypes;

import java.util.ArrayList;

public class Target {

	
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,1,1,2,3,0,3,9};
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		for(int i =0 ; i<a.length; i++) {
			
			for(int j= i+1; j<a.length;j++) {
			
			if(a[i]== a[j]) {
				al.add(a[i]);
				break;
			}
				}
		}
		
     System.out.println(al);
      
	}
}
