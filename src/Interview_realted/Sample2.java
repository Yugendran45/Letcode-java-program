package Interview_realted;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {

	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7};
		
		//output = {(1,5),(2,4),(3,3),(4,3),(4,2),(5,1)}
		
		
		int target = 6;
		
		for(int i =0 ; i<a.length; i++) {
			for(int j =i+1 ; j<a.length; j++) {
				if(a[i]+a[j] == target) {
					System.out.println(i+","+j);
					
					
					
				}
			}
		}
		
	}
	 
}
