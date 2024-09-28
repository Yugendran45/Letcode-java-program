package Roughcopyarea;

public class change1 {
	
		public static void main(String[] args) {
			
		int[] a = {1,2,3,4};
		//output = [24,12,8,6]
		int m =1;
		
		int[] b1 = new int[a.length];
		for(int i =0 ; i<a.length; i++) {
			m=m*a[i];
		}
		
		
		for(int i = 0 ; i<a.length; i++) {
			 b1[i]=m/a[i];
		
		}
		for(int mx : b1) {
			System.out.println(mx);
		}
	}
	}


//int[] a = {1, 2, 3, 4};
//int n = a.length;
//
//int[] leftProducts = new int[n];
//int[] rightProducts = new int[n];
//int[] output = new int[n];
//
//// Fill leftProducts array
//leftProducts[0] = 1;
//for (int i = 1; i < n; i++) {
//    leftProducts[i] = leftProducts[i - 1] * a[i - 1];
//}
//
//// Fill rightProducts array
//rightProducts[n - 1] = 1;
//for (int i = n - 2; i >= 0; i--) {
//    rightProducts[i] = rightProducts[i + 1] * a[i + 1];
//}
//
//// Construct the output array
//for (int i = 0; i < n; i++) {
//    output[i] = leftProducts[i] * rightProducts[i];
//}
//
//// Print the output array
//for (int value : output) {
//    System.out.println(value);
//}