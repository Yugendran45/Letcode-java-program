package Arraytypes;

public class Minimun_and_maximumnumberArray {
	
	public static void main(String[] args) {
		
	int[] a = {2,3,4,5,8,3,2,4,6,5};
	
	int b = a[0];
	int c = a[0];
	int d = a[0];
	
	
	 
	for(int i =0 ; i<a.length; i++) {
		for(int j=i+1 ; j<a.length;j++) {
			if(a[j]<a[i]) {
				b = a[j];				
			}
		}
		for(int i1=0; i1<a.length; i1++) {
			for(int j1 =0; j1<a.length;j1++) {
				if(a[i1]<a[j1]) {
					c =a[j1];
					
				}
			}
          		for(int i2=0; i2<a.length;i2++) {
          		if(a[i]>b && a[i]<c) {
          			d = a[i2];
          		}
          			
          		}
			
		}
	}
		
		System.out.println(d);
		System.out.println(c);
	}

}
