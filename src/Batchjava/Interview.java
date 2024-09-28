package Batchjava;

public class Interview {
	
	
	public static void main(String[] args) {

		int[] a = { 1, 2, -2, 4, -4 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == 0) {
					count++;
				}
			}
		}

		System.out.println("The count is : " + count);

	}

}
