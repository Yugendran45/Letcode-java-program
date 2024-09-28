package Arraytypes;

import java.util.ArrayList;

public class Print_the_duplicate_number_on_array {
	
	
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,6,10,2,3,4,2,4,6,10};
		
		ArrayList<Integer> al = new ArrayList<>();
		
		
		for(int i = 0 ; i<a.length ; i++) {
			
			for(int j= i+1; j<a.length ; j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[j]);
					break ;
				}
			}
		}
		
			}

}
