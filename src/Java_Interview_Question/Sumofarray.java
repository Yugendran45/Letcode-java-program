package Java_Interview_Question;

public class Sumofarray {
	
	
	public static void main(String[] args) {
		
	 int a[]= {12,3,2,42,3,34,3,2};
	 int count=0;
	 
	 
	 for(int i=0;i<a.length;i++) {
		 count=count+a[i];
		 
	 }
		System.out.println("The sum of array :"+count);
	}

}
