package Java_Interview_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveArrayduplicate {
	
	public static void main(String[] args) {

		// Remove duplicates 

		int[] a = { 0, 1, 2, 3, 3, 3, 2, 2, 5, 4, 5, 8 };


		int count =-1;
		
    for(int i =0; i<a.length;i++) {
    	if(a[i] != -1) {
    		for(int j=i+1; j<a.length; j++) {
    			if(a[i]==a[j]) {
    				a[j]=count;
    			}
    		}
    		
    	}
    }
	System.out.println(Arrays.toString(a));
	
	
	for(int i = 0 ; i<a.length;i++) {
		if(a[i] !=-1) {
			System.out.println(a[i]);
		}

	}
	}
	
}
