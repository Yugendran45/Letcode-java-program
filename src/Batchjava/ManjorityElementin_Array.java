package Batchjava;

public class ManjorityElementin_Array {
	
	public static void main(String[] args) {
		
	
		int[] a= {3,1,1,1,1,1,2,4,4,4};
       int m=a.length;
		
		int firestcount =a[0];
		
		int count =0;
		
		int candi =0;
		
		for(int i=0;i<a.length;i++) {
		for(int j=0; j<a.length;j++) {
			if(a[i]==a[j]) {
				count=count+1;
			}
				
					
			}if(count>m/2) {
				firestcount=a[i];
				
		}
		}
		
		System.out.println(firestcount);	
	}	

}
