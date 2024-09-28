package Batchjava;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommannumberinArray {
	
	public static void main(String[] args) {
		int[] a = {1,3,5,6,8,7,9};
		int[] b = {1,2,3,4,6,7,8};
		Set<Integer> s = new LinkedHashSet<>();
		Set<Integer> s1 = new LinkedHashSet<>();
		for(int number: a) {
			s.add(number);
		}
		for(int number2 :b) {
			s1.add(number2);
		}
	  s.retainAll(s1);
	  System.out.println(s);
    //System.arraycopy(s, 0, s, 0, 0);
	
	}

}
