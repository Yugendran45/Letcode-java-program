package Arraytypes;

public class Rough {
	
	public static void main(String[] args) {
		
		int[] a = {2,4,6};
		
		int k = 1;
		
		int count =0;
		
		while(a[k] >0) {
			
			for(int i=0;i<a.length;i++) {
				 if(a[i]>0) {
					 a[i]--;
					 count=count+i+1;
					 
				 }if(i==k&&a[i]==0) {
					 
					  
					  
				 }
				 
				
			}
			 
		}
		
		
		System.out.println(count);
	}
	
}
