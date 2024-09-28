package Arraytypes;

import java.util.ArrayList;

public class zeroprint_last_using_set {
	
	
	public static void main(String[] args) {
		
		
		int[] a = {1,0,3,0,5,0,7,0,8,0};
		
		ArrayList al = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		for(int i=0;i<a.length; i++) {
			
			if(a[i]!= 0) {
				al.add(a[i]);
			}else {
				al2.add(a[i]);
				
			}
			
			
		}
		
		al.addAll(al2);
		System.out.println(al);
	
	}
}
