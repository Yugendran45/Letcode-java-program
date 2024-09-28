package Batchjava;

import java.util.ArrayList;
import java.util.Arrays;

public class Mergedarray {

	public static void main(String[] args) {
		
	 int[] num = {1,2,3,0,0,0};
     int[] num1 ={3,6,2};
     
     ArrayList<Integer> al = new ArrayList<>();
     
     
     
     for(int i=0;i<num.length;i++) {
    	 if(num[i]!=0) {
    		 al.add(num[i]);
    	 }
    	 
     }     
     for(int i =0;i<num1.length;i++) {
    	 al.add(num1[i]);
     }
     
     
		System.out.println(al);
	}
}
