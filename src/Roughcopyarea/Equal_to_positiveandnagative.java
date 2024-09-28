package Roughcopyarea;

import java.util.ArrayList;

public class Equal_to_positiveandnagative {
	
	
	public static void main(String[] args) {
		
		int[] a = {-1,-2,1,2,2,3,-3,-4};
		ArrayList<Integer> al = new ArrayList();
		ArrayList<Integer> bl = new ArrayList();
		
		for(int i =0 ; i<a.length ;i++) {
			
		if(a[i]<0) {
			al.add(a[i]);
		}else {
			bl.add(a[i]);
		}
			
		}
		int size = al.size();
		int size2 = bl.size();
		
		System.out.println(al);
		System.out.println(bl);

		if(size == size2) {
			System.out.println("its equal");
		}else {
			System.out.println("its not equal");
		}
		
	}

}
