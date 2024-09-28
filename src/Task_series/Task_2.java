package Task_series;

public class Task_2 {
	
	
	public static void main(String[] args) {
		// Input : [1,9,2,3,4,5,1]
		// Output : 4

		int[] a = { 1, 9, 2, 3, 4, 5, 1 };

		int value = 0;

		for (int i = 0; i < a.length; i++) {

			int count = a[i] + 1;

			for (int j = i + 1; j < a.length; j++) {

				if (count == a[j]) {
					value++;
				}

			}
		}
		System.out.println(value);
	}

}
