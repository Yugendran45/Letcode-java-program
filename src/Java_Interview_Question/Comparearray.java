package Java_Interview_Question;

public class Comparearray {
	
	public static void main(String[] args) {
		int[] a = {12,13,14,15};
		int[] b = {11,13,14,15};
		
		boolean status = false;
			
		if(a.length == b.length) {
			
			for(int i =0;i<a.length;i++) {
				for(int j=0;j<b.length-1;j++) {
					if(a[i]==b[j])
						status =true;
				}
			}
			
		}else {
			status=false;
			
		}
			
		if(status) {
			System.out.println("The array is equal");
		}	else {
			System.out.println("The array is not equal");
		}
		
	}

}
