package Arraytypes;

public class Maximun_number_of_count {
	
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,1,4,5,1,1,1,3,1,1};
		
		int maxcount = 0;
		int maxnumber = a[0];
		
		//Output maximum count number is =7
		
		for(int i =0 ; i<a.length; i++) {
	         int current = 1;
			for(int j = i+1; j<a.length ; j++) {
				if(a[i]==a[j]) {
					current++;
				}
			}if(current >maxcount) {
					maxcount=current;
					maxnumber=a[i];
				}
			}
		
		
		
		System.out.println("The number of  "+maxnumber);
		System.out.println("The number of count"+maxcount);
	}

}
