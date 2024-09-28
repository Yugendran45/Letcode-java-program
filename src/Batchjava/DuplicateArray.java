package Batchjava;

public class DuplicateArray {
	
	
	//maximum number count 
	//minimun number count
	
	public static void main(String[] args) {
		int a[] = { 1,2,3,1,2,1,2,1,3,1,2};
		int b = a[0];
		int maxcount = 1;
		int minimum = 1;
		int c = a[0];

		for (int i = 0; i < a.length; i++) {
			int current = a[i];
			int checkcount = 1;

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] == current) {
					checkcount++;

				}
				if (checkcount > maxcount) {
					maxcount = checkcount;
					b = current;
				}

				else {
					minimum = checkcount;
					c=current;
				     

				}

			}
		}

		System.out.println("minimumnumber"+c);
		System.out.println("minimumcount" +minimum);
		System.out.println("maximunnumber" + b);
		System.out.println("maximun count" + maxcount);
	}

}
