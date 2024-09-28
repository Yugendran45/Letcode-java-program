package Batchjava;

public class Missingthanumber {
	
public static void main(String[] args) {
		
		int[] a = {1,2,3,4,6,7,8,9};
		int sum1 = 0;
		int sum2 = 0;
		int sum3 =0;
		
		int champ = a.length;
		
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		
		for(int i=1; i<=9; i++) {
		sum2=sum2+i;
		sum3 =sum1-sum2;
		
		
		}
		System.out.println(sum3);
		
	}

}
