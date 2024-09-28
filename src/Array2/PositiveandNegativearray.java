package Array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PositiveandNegativearray {
	
	public static void main(String[] args) {
		//inputs
		int[] num1= {1,2,4};
		int[] num2= {2,3,4,4};
		
		//outputs ==> {2,4}
		
		Set<Integer> s =new HashSet<>();
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		
		for(int i=0;i<num1.length;i++) {
			s.add(num1[i]);
			
			
		}
		for(int j=0;j<num2.length;j++) {
			if(s.contains(num2[j])){
				arr.add(num2[j]);
				s.remove(num2[j]);
			}
		}
		System.out.println(arr);
	    System.out.println(s);
	}

}
