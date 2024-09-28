package Task_series;

public class Task_1 {
	
	public static void main(String[] args) {
		//Input : [2,5,7,8],target = 9
		//		output : True

		int[] a = {2,5,7,8};
		int target = 9 ;
		
		boolean status = false;

		for(int i =0 ; i<a.length; i++) {
			for(int j = i+1 ; j<a.length ; j++) {
				if(a[i]+a[j] == target) {
					status =true ;
					
				}
			}
		}
		System.out.println(status);
	}

}
